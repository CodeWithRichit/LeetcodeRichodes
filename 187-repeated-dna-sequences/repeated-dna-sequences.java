class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        //Normal looping
        HashSet<String> seen=new HashSet<>();
        HashSet<String> res=new HashSet<>();
        for(int i=0;i<=s.length()-10;i++){
            String s1=s.substring(i,i+10);
            if(seen.contains(s1)){
                res.add(s1);
            }
            else{
                seen.add(s1);
            }
        }
        List<String> list = new ArrayList<>(res);
        return list;
    }
}