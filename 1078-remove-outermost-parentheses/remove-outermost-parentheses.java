class Solution {
    public String removeOuterParentheses(String s) {
        String[] str=s.split("");
       Stack<String> st=new Stack<>();
       int i=0;
       StringBuilder ans=new StringBuilder();
       while(i<str.length){
        if(st.size()==0 && str[i].equals("(")){
            st.push("(");
        }
        else if(st.size()!=0 && str[i].equals("(")){
            st.push("(");
            ans.append("(");
        }
        if(str[i].equals(")")){
            st.pop();
            if(st.size()!=0)ans.append(")");
        }
        i++;
       }
       return ans.toString(); 
    }
}