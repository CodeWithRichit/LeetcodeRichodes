class Solution {
    public int maxProduct(int[] nums) {
        int f=Integer.MIN_VALUE;
        int s=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>=f){
                s=f;
                f=nums[i];
            }
            else if(nums[i]!=f && nums[i]>s){
                s=nums[i];
            }
        }
        int p=(s-1)*(f-1);
        return p;
    }
}