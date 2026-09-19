class Solution {
    public int[] nextGreaterElements(int[] nums) {
        Stack<Integer> st=new Stack<>();
        for(int i=nums.length-1;i>=0;i--){
            st.push(nums[i]);
        }
        int[] ans=new int[nums.length];
        for(int i=nums.length-1;i>=0;i--){
            while(st.size()>0 && st.peek()<=nums[i]){
                st.pop();
            }
            if(st.size()!=0){
                ans[i]=st.peek();
            }
            else{
                ans[i]=-1;
            }
            st.push(nums[i]);
        }
        return ans;
    //     Stack<Integer> st=new Stack<>();
    //     for(int i=nums.length-1;i>=0;i--){
    //         st.push(nums[i]);
    //     }
    //     int[] arr=new int[nums.length];
    //     for(int i=nums.length-1;i>=0;i--){
    //         if(st.peek()>nums[i]){
    //             arr[i]=st.peek();
    //             st.push(nums[i]);
    //         }
    //         else{
    //             while(st.size()!=0&&st.peek()<=nums[i]){
    //                 st.pop();
    //             }
    //             if(st.size()==0){
    //                 arr[i]=-1;
    //             }
    //             else{
    //                 arr[i]=st.peek();  
    //             }
    //             st.push(nums[i]);
    //         }
    //     }
    //     return arr;
    }
}