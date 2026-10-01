class Solution {
    public int largestRectangleArea(int[] heights) {
        Stack<Integer> st=new Stack<>();
        int n=heights.length;
        int[] nse=new int[n];
        nse[n-1]=n;
        st.push(n-1);
        for(int i=n-2;i>=0;i--){
            while(st.size()>0 && heights[st.peek()]>heights[i])st.pop();
            if(st.size()==0)nse[i]=n;
            else nse[i]=st.peek();
            st.push(i);
        }
        while(st.size()!=0)st.pop();
        int ma=heights[0]*(nse[0]);
        st.push(0);
        for(int i=1;i<n;i++){
            while(st.size()>0 && heights[st.peek()]>=heights[i])st.pop();
            if(st.size()==0){
                int a=heights[i]*(nse[i]);
                ma=Math.max(ma,a);
            }
            else{
                int a=heights[i]*(nse[i]-st.peek()-1);
                ma=Math.max(ma,a);
            }
            st.push(i);
        }
        return ma;
        // Stack<Integer> st=new Stack<>();
        // int n=heights.length;
        // int[] nse=new int[n];
        // int[] pse=new int[n];
        // nse[n-1]=n;
        // st.push(n-1);
        // for(int i=n-2;i>=0;i--){
        //     while(st.size()>0 && heights[st.peek()]>heights[i])st.pop();
        //     if(st.size()==0)nse[i]=n;
        //     else nse[i]=st.peek();
        //     st.push(i);
        // }
        // while(st.size()!=0)st.pop();
        // pse[0]=-1;
        // st.push(0);
        // for(int i=1;i<n;i++){
        //     while(st.size()>0 && heights[st.peek()]>heights[i])st.pop();
        //     if(st.size()==0)pse[i]=-1;
        //     else pse[i]=st.peek();
        //     st.push(i);
        // }
        // int ma=0;
        // for(int i=0;i<n;i++){
        //    int a=heights[i]*(nse[i]-pse[i]-1);
        //    ma=Math.max(ma,a);
        // }
        // return ma;
        // Stack<Integer> st=new Stack<>();
        // int n=heights.length;
        // int[] nse=new int[n];
        // nse[n-1]=n;//last element ka next smaller element kuch ni hoga..so index=length dediya(calculation)
        // st.push(n-1);//index of last element
        // for(int i=n-2;i>=0;i--){
        //     while(st.size()!=0 && heights[st.peek()]>=heights[i])st.pop();
        //     if(st.size()==0)nse[i]=n;
        //     else nse[i]=st.peek();
        //     st.push(i);
        // }
        // while(st.size()>0)st.pop();
        // int[] pse=new int[n];
        // pse[0]=-1;//imaginary 0 size ki building ka index put kiya hai for calculation
        // st.push(0);//index of first element
        // for(int i=1;i<n;i++){
        //     while(st.size()!=0 && heights[st.peek()]>=heights[i])st.pop();
        //     if(st.size()==0)pse[i]=-1;
        //     else pse[i]=st.peek();
        //     st.push(i);
        // }
        // int ma=0;
        // for(int i=0;i<n;i++){
        //     int a=heights[i]*(nse[i]-pse[i]-1);
        //     ma=Math.max(ma,a);
        // }
        // return ma;
    }
}