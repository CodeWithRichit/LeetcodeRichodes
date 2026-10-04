class Solution {
    public int countStudents(int[] arr, int[] nums) {
        Queue<Integer> q=new LinkedList<>();
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<arr.length;i++){
            q.add(arr[i]);
        }
        for(int i=nums.length-1;i>=0;i--){
            st.add(nums[i]);
        }
        while(q.size()>0){
            int v=1;
            int n=q.size();
            for(int i=0;i<n;i++){
                if(st.peek()==q.peek()){
                    st.pop();
                    q.remove();
                    v=0;
                    break;
                }
                q.add(q.remove());
            }
            if(v==1){
              return (q.size());
            }
        }
        return 0;
    }
}