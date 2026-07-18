class Solution {
    public String longestCommonPrefix(String[] strs) {
        //testcase 1
        // int i=0;
        // String s="";
        // while(i<strs[0].length()){
        //     if(strs[0].charAt(i)==strs[1].charAt(i) && strs[0].charAt(i)==strs[2].charAt(i)){
        //        s=s+strs[0].charAt(i);
        //        i++;
        //     }
        //     else{
        //         break;
        //     }
        // }
        int minl=Integer.MAX_VALUE;
        int idx=-1;
        for(int i=0;i<strs.length;i++){
            if(strs[i].length()<minl){
                minl=strs[i].length();
                idx=i;
            }
        }
        String s="";
        int i=0;
        while(i<strs[idx].length()){
            int c=1;
            for(int j=0;j<strs.length;j++){
                if(strs[idx].charAt(i)!=strs[j].charAt(i)){
                   c=0;
                   break;
                }
            }
            if(c==1){
                s=s+strs[idx].charAt(i);
                i++;
            }
            else{
                break;
            }
        }
        return s;
    }
}