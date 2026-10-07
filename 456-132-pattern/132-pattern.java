class Solution {
    public boolean find132pattern(int[] nums) {
        Stack<Integer> st=new Stack<>();
        int i=nums.length-1,sm=Integer.MIN_VALUE;
        st.push(nums[i]);
        i--;
        while(i>=0){
          if(sm>nums[i])return true;
          while(st.size()!=0 && st.peek()<nums[i]){
              int n=st.pop();
              sm=Math.max(n,sm);
          }
          st.push(nums[i]);
          i--;
        }
        return false;
        // int i=1;
        // st.push(nums[0]);
        // while(i<nums.length){
        //     Stack<Integer> up=new Stack<>();
        //     Stack<Integer> down=new Stack<>();
        //     while(st.size()!=0 && st.peek()<=nums[i]){
        //         up.push(st.pop());
        //     }
        //     if(st.size()==0){
        //         while(up.size()!=0)st.push(up.pop());
        //     }
        //     else{
        //         while(st.size()!=0 && st.peek()>=nums[i]){
        //             down.push(st.pop());
        //         }
        //         if(st.size()==0){while(down.size()!=0)st.push(down.pop());
        //         while(up.size()!=0)st.push(up.pop());}
        //         else return true;
        //     }
        //     st.push(nums[i]);
        //     i++;
        // }
        // return false;
    }
}