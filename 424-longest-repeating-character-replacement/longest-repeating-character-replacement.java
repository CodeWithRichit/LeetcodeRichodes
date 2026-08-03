class Solution {
    public int characterReplacement(String s, int k) {
        int lmax=0,i=0,j=0;
        HashMap<Character,Integer> map=new HashMap<>();
        while(i<=j && j<s.length()){
            char c=s.charAt(j);
            map.put(c, map.getOrDefault(c, 0) + 1);
            int m=0;
            for(char e:map.keySet()){
                if(map.get(e)>m){
                    m=map.get(e);
                }
            }
            while(j-i+1-m>k){
                char left = s.charAt(i);
                map.put(left, map.get(left) - 1);
                i++;
            }
            lmax=Math.max(lmax, j-i+1);
            j++;
        }
        return lmax;
    }
}