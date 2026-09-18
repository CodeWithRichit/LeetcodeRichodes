class Solution {
    public String reverseWords(String s) {
        String str = s.trim();
        StringBuilder sb = new StringBuilder(str);
        int i = 0;
        while (i < sb.length()) {
            if (sb.charAt(i) == ' ') {
                while (i + 1 < sb.length() && sb.charAt(i + 1) == ' ') {
                    sb.deleteCharAt(i + 1);
                }
            }
            i++;
        }
        String[] arr = sb.toString().split(" ");
        int j = 0, k = arr.length - 1;
        while (j < k) {
            String temp = arr[j];
            arr[j] = arr[k];
            arr[k] = temp;
            j++;
            k--;
        }
        return String.join(" ", arr);
    }
}