class Solution {
    public int firstUniqChar(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
        int n=s.length();
        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            if(map.containsKey(ch)){
                map.put(ch,map.get(ch)+1);
            }
            else{
                map.put(ch,1);
            }
        }
        for(int i=0;i<n;i++){
           char c=s.charAt(i);
           if(map.get(c)==1){
            return i;
           }
        }
        return -1;
        // for(int i=0;i<s.length();i++){
        //     int r=1,l=1;
        //     for(int j=i-1;j>=0;j--){
        //         if(s.charAt(i)==s.charAt(j)){
        //            r=0;
        //            break;
        //         }
        //     }
        //     for(int j=i+1;j<s.length();j++){
        //         if(s.charAt(i)==s.charAt(j)){
        //             l=0;
        //             break;
        //         }
        //     }
        //     if(r==1 && l==1){
        //         return i;
        //     }
        // }
        // return -1;
    }
}