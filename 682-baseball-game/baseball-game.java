class Solution {
    public int calPoints(String[] ops) {
        Stack<String> st=new Stack<>();
        for(String i:ops){
            if(i.equals("+")){
                int t=Integer.parseInt(st.pop());
                int s=Integer.parseInt(st.pop());
                int n=s+t;
                st.push(""+s);
                st.push(""+t);
                st.push(""+n);
            }
            else if(i.equals("D")){
                int t=Integer.parseInt(st.pop());
                int n=t*2;
                st.push(""+t);
                st.push(""+n);
            }
            else if(i.equals("C")){
                st.pop();
            }
            else{
                st.push(i);
            }
        }
        int sum=0;
        while(st.size()!=0){
            sum=sum+Integer.parseInt(st.pop());
        }
        return sum;
    }
}