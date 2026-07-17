class Solution {
    public int firstUniqChar(String s) {
        for(int i=0;i<s.length();i++){
            int r=1,l=1;
            for(int j=i-1;j>=0;j--){
                if(s.charAt(i)==s.charAt(j)){
                   r=0;
                   break;
                }
            }
            for(int j=i+1;j<s.length();j++){
                if(s.charAt(i)==s.charAt(j)){
                    l=0;
                    break;
                }
            }
            if(r==1 && l==1){
                return i;
            }
        }
        return -1;
    }
}