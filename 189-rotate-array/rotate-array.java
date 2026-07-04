class Solution {
    public void rotate(int[] nums, int k) {
        int n=nums.length;
        int[] ans=new int[n];
        k=k%n;
        for(int i=0;i<n;i++){
            ans[(i+k)%n]=nums[i];
        }
        for(int i=0;i<n;i++){
            nums[i]=ans[i];
        }
    }
    // public void rotate(int[] nums, int k) {
    //     while(k-->0){
    //     rotateOne(nums);
    //     }
    // }
    // public void rotateOne(int[] nums){
    //     int last=nums[nums.length-1];
    //     for(int i=nums.length-1;i>0;i--){
    //         nums[i]=nums[i-1];
    //     }
    //     nums[0]=last;
    // }
}