class Solution {
    public void rotate(int[] nums, int k) {
         int n=nums.length;
        // int[] ans=new int[n];
        k=k%n;
        // for(int i=0;i<n;i++){
        //     ans[(i+k)%n]=nums[i];
        // }
        // for(int i=0;i<n;i++){
        //     nums[i]=ans[i];
        // }
        rev(nums,0,nums.length-1);
        rev(nums,0,k-1);
        rev(nums,k,nums.length-1);
    }
    public void rev(int[] nums,int i,int j){
       while(i<=j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
        i++;
        j--;
       }
    }
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