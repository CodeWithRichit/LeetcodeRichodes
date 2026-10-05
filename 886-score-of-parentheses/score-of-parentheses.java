class Solution {
    public int scoreOfParentheses(String s) {
        Stack<String> st=new Stack<>();
        String[] arr=s.split("");
        int i=0;
        while(i<arr.length){
          String ch=arr[i];
          if(ch.equals("(")){
            st.push(ch);
          }
          else if(st.size()!=0 && ch.equals(")") && st.peek().equals("(")){
            st.pop();
            st.push("1");
          }
          else if(ch.equals(")") && !st.peek().equals("(")){
            int sum = 0;
            while (!st.peek().equals("(")) {
               sum += Integer.parseInt(st.pop());
            }
            String n=""+(2*sum);
            st.pop();
            st.push(n);
          }
          i++;
        }
        int c=0;
        while(st.size()>0){
            c=c+Integer.parseInt(st.pop());
        }
        return c;
    }
}