class Solution {
    public String removeOuterParentheses(String s) {
       Stack<String> st=new Stack<>();
       int i=0;
       StringBuilder ans=new StringBuilder();
       while(i<s.length()){
        if(st.size()==0 && s.charAt(i)=='('){
            st.push("(");
        }
        else if(st.size()!=0 && s.charAt(i)=='('){
            st.push("(");
            ans.append("(");
        }
        if(s.charAt(i)==')'){
            st.pop();
            if(st.size()!=0)ans.append(")");
        }
        i++;
       }
       return ans.toString(); 
    }
}