class Solution {
    public int[] canSeePersonsCount(int[] arr) {
        Stack<Integer> st=new Stack<>();
        int[] ans=new int[arr.length];
        ans[arr.length-1]=0;
        st.push(arr[arr.length-1]);
        for(int i=arr.length-2;i>=0;i--){
            int c=0;
            while(st.size()>0 && arr[i]>=st.peek()){
                st.pop();
                c++;
            }
            if(st.size()>0 && st.peek()>arr[i]) c++;
            ans[i]=c;
            st.push(arr[i]);
        }
        return ans;
        //TLE
        // Stack<Integer> st = new Stack<>();
        // Stack<Integer> temp = new Stack<>();
        // int[] ans = new int[arr.length];
        // for (int i = arr.length - 1; i >= 0; i--) {
        //     st.push(arr[i]);
        // }
        // int pos = 0;
        // while (st.size() > 0) { 
        //     int e = st.pop();
        //     int c = 0;
        //     int prev = Integer.MIN_VALUE;
        //     while (st.size() != 0) {
        //         int current = st.pop();
        //         if (current > prev) {
        //             c++;
        //         }
        //         temp.push(current);
        //         prev = Math.max(prev, current);
        //         if (current > e) {
        //             break;
        //         }
        //     }
        //     while (temp.size() != 0) {
        //         st.push(temp.pop());
        //     }
        //     ans[pos] = c;
        //     pos++;
        // }
        // return ans;
    }
}