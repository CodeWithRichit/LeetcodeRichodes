class Solution {
    public String makeGood(String s) {
        if(s.length()==0 || s.length()==1)return s;
        Stack<Character> st=new Stack<>();
        for(int i=0;i<=s.length()-1;i++){
           char ch=s.charAt(i);
           if(st.size()==0)st.push(ch);
           else if(st.size()>0 && (st.peek()+32!=ch && st.peek()!=ch+32)){
            st.push(ch);
           }
          else if(st.size()>0 && (st.peek()+32==ch || st.peek()==ch+32))st.pop();
        }
        StringBuilder sb=new StringBuilder();
        while(st.size()>0)sb.append(st.pop());
        sb.reverse();
        return sb.toString();
        }
    }