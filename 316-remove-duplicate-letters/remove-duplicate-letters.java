class Solution {
    public String removeDuplicateLetters(String s) {
        LinkedHashSet<Character> set=new LinkedHashSet<>();
        Stack<Character> st=new Stack<>();
        for(int i=0;i<s.length();i++){
            if(!set.contains(s.charAt(i)))set.add(s.charAt(i));
        }
        HashMap<Character,Integer> map=new HashMap<>();
        for(char e:set){
            map.put(e,s.lastIndexOf(e));
        }
        int k=0;
        HashSet<Character> ses=new HashSet<>();
        while(k<s.length()){
           if(!ses.contains(s.charAt(k))) {
                while(st.size() != 0 && st.peek() > s.charAt(k) && k < map.get(st.peek())) {
                    ses.remove(st.pop());
                }
                st.push(s.charAt(k));
                ses.add(s.charAt(k));
            }
           k++;
        }
        StringBuilder sb=new StringBuilder();
        while(st.size()!=0){
            sb.append(st.pop());
        }
        sb.reverse();
        return sb.toString();
    }
}