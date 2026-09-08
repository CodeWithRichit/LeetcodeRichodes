class Solution {
    public int compress(char[] chars) {
        StringBuilder str=new StringBuilder();
        int i=0,j=0;
        while(j<chars.length){
            int count=0;
            while(j < chars.length && chars[i]==chars[j]){
                j++;
                count++;
            }
            str.append(chars[i]);
            if(count>1){
                str.append(count);
            }
            i=j;
        }
        for (int k = 0; k < str.length(); k++) {
            chars[k] = str.charAt(k);
        }
        return str.length();
    }
}