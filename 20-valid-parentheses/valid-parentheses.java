class Solution {
    public boolean Same(Character ch,Character c){
        if(ch=='(' && c==')')return true;
        if(ch=='{' && c=='}')return true;
        if(ch=='[' && c==']')return true;
        return false;
    }
    public boolean isValid(String str) {
        Stack<Character> st=new Stack<>();
        if(str.length()%2!=0){
          return false;
        }
        int i=0;
        while(i<str.length()){
            if(str.charAt(i)=='('|| str.charAt(i)=='['||str.charAt(i)=='{'){
                st.push(str.charAt(i));
            }
            else{
                if(st.size()==0)return false;
                if(Same(st.peek(),str.charAt(i))){
                    st.pop();
                }
                else return false;
            }
            i++;
        }
        if(st.size()==0)return true;
        return false;
    }
}