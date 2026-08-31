class Solution {
    public boolean areOccurrencesEqual(String s) {
        HashMap<Character,Integer> map=new HashMap<Character,Integer>();
        for(int i=0;i<s.length();i++){
            if(map.containsKey(s.charAt(i))){
                int f=map.get(s.charAt(i));
                map.put(s.charAt(i),f+1);
            }
            else{
                map.put(s.charAt(i),1);
            }
        }
        int freq=map.get(s.charAt(0));
        for(char e:map.keySet()){
            if(map.get(e)!=freq){
                return false;
            }
        }
        return true;
    }
}