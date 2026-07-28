class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
        int i=0,j=0,max=0,length=0;
        while(j<s.length()){
            map.put(s.charAt(j), map.getOrDefault(s.charAt(j), 0) + 1);
            if(map.get(s.charAt(j))>1){
                length=j-i;
                max=Math.max(max,length);
                while(i<=j && map.get(s.charAt(j))!=1){
                    map.put(s.charAt(i),map.get(s.charAt(i))-1);
                    i++;
                }
            }
            j++;
        }
        length=j-i;
        max=Math.max(max,length);
        return max;
    }
}
// abcake