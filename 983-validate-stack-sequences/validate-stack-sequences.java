class Solution {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        Stack<Integer> st=new Stack<>();
        int i=0,j=0;
        while(i<pushed.length){
            st.push(pushed[i]);
            if(st.peek()==popped[j]){
                while(st.size()>0 && st.peek()==popped[j] && i<pushed.length && j<popped.length){
                    st.pop();
                    j++;
                }
            }
            i++;
        }
        if(j!=popped.length)return false;
        return true;
    }
}