class Solution {
    public boolean isAnagram(String s, String t) {
        char[] sa=s.toCharArray();
        char[] ta=t.toCharArray();
        Arrays.sort(sa);
        Arrays.sort(ta);
        if(sa.length!=ta.length){
            return false;
        }
        for(int i=0;i<sa.length;i++){
            if(sa[i]!=ta[i]){
                return false;
            }
        }
        return true;
    }
}