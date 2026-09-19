class Solution {
    public int[] finalPrices(int[] prices) {
        Stack<Integer> st=new Stack<>();
        int[] ans=new int[prices.length];
        ans[ans.length-1]=prices[prices.length-1];
        st.push(prices[prices.length-1]);
        for(int i=prices.length-2;i>=0;i--){
            while(st.size()>0 && st.peek()>prices[i]){
                st.pop();
            }
            if(st.size()==0){
                ans[i]=prices[i];
            }
            else{
                ans[i]=prices[i]-st.peek();
            }
            st.push(prices[i]);
        }
        return ans;
    }
}