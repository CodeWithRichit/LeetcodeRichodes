class Solution {
    public int calPoints(String[] ops) {
        Stack<Integer> st=new Stack<>();
        for(String i:ops){
            if(i.equals("+")){
                int t=st.pop();
                int s=st.pop();
                int n=s+t;
                st.push(s);
                st.push(t);
                st.push(n);
            }
            else if(i.equals("D")){
                int t=st.pop();
                int n=t*2;
                st.push(t);
                st.push(n);
            }
            else if(i.equals("C")){
                st.pop();
            }
            else{
                st.push(Integer.parseInt(i));
            }
        }
        int sum=0;
        while(st.size()!=0){
            sum=sum+st.pop();
        }
        return sum;
    }
}