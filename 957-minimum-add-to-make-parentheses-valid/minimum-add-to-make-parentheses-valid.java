class Solution {
    public int minAddToMakeValid(String s) {
        Stack<Character> st=new Stack<>();
        if(s.length()==0)return 0;
        int i=0;
        while(i<s.length()){
            if(st.size()!=0 && st.peek()=='(' && s.charAt(i)==')'){
                st.pop();
            }
            else if(s.charAt(i) == '(') {
                st.push(s.charAt(i));
            }
            else {
                st.push(')');
            }
            i++;
        }
        return st.size();
    }
}