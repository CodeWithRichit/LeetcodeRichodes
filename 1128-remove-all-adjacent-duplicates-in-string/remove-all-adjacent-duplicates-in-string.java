class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> st=new Stack<>();
        StringBuilder sb=new StringBuilder();

        int i=0;
        while(i<s.length()){
            if(st.size()!=0 && s.charAt(i)==st.peek()){
                st.pop();
            }
            else{
                st.push(s.charAt(i));
            }
            i++;
        }
        while(st.size()!=0){
            sb.append(st.pop());
        }
        sb.reverse();
        return sb.toString();
    }
}