class Solution {
    public String decodeString(String s) {
        Stack<Character> st=new Stack<>();
        int i=s.length()-1;
        while(i>=0){
            if(st.size()==0 || st.peek()!='['){
                st.push(s.charAt(i));
                i--;
            }
            else{
                int num=0;
                int place=1;
               while(i>=0 && Character.isDigit(s.charAt(i))){
                int digit=Character.getNumericValue(s.charAt(i));
                num=digit*place+num;
                place=place*10;
                i--;
               }
               StringBuilder sb=new StringBuilder();
               while(st.size()>0 && st.peek()!=']'){
                    char popped=st.pop();
                    if(popped!='[')sb.append(popped);
               }
               st.pop();
               for(int k=0;k<num;k++){
                for(int j=sb.length()-1;j>=0;j--){
                    st.push(sb.charAt(j));
                }
               }
            }
        }
        StringBuilder ans=new StringBuilder();
        while(st.size()>0){
            ans.append(st.pop());
        }
        return ans.toString();
    }
}