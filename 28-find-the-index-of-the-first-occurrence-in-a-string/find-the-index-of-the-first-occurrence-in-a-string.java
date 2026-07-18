class Solution {
    public int strStr(String h, String n) {
        if(n.length()>h.length()){
            return -1;
        }
        int idx=-1;
        int j=0;
        while(j<=h.length()-n.length()){
            if(h.charAt(j)==n.charAt(0)){
                idx=j;
                int c=1,k=j;
               for(int i=0;i<n.length();i++){
                if(h.charAt(k)!=n.charAt(i)){
                    c=0;
                    break;
                }
                k++;
               }    
               if(c==1){
                return idx;
               }
               else{
                j++;
               }
            }
            else{j++;}
        }
        return -1;
    }
}