class Solution {
    public String removeKdigits(String num, int k) {
        if(num.length()==k)return "0";
        String s = "" + num;
        char[] arr = s.toCharArray();
        int c = 0;
        Stack<Character> st = new Stack<>();
        int i = 0;
        while (i < arr.length) {
            if (c == k)
                break; 
            while (st.size() != 0 && st.peek() > arr[i] && c < k) {
                st.pop();
                c++;
            }
            st.push(arr[i]);
            i++;
        }
        while (i < arr.length) {
            st.push(arr[i]);
            i++;
        }
         while (c < k) {
            st.pop();
            c++;
        }
        StringBuilder sb = new StringBuilder();
        while (st.size() > 0) {
            sb.append(st.pop());
        }
        sb.reverse();
        int l=0;
        while(l<sb.length() && sb.charAt(l)=='0')l++;
        sb.delete(0,l);
        if (sb.length() == 0)
            return "0";
        return sb.toString();
    }
}