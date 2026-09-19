class Solution {
    public int[] dailyTemperatures(int[] arr) {
        int[] ans=new int[arr.length];
        Stack<Integer> st=new Stack<>();
        st.push(arr.length-1);
        ans[ans.length-1]=0;
        for(int i=arr.length-2;i>=0;i--){
            while(st.size()>0 && arr[st.peek()]<=arr[i]){
                st.pop();
            }
            if(st.size()!=0){
                ans[i]=st.peek()-i;
            }
            else{ans[i]=0;}
            st.push(i);
        }
        return ans;
    }
}