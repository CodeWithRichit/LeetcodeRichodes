class Solution {
    public int[] sortedSquares(int[] nums) {
        int n=nums.length;
        int[] ans=new int[n];
        int i=0,j=n-1,pos=n-1;
        while(i<=j){
            int sqi=nums[i]*nums[i];
            int sqj=nums[j]*nums[j];
            if(sqi>sqj){
               ans[pos]=sqi;
               i++;
            }
            else{
                ans[pos]=sqj;
                j--;
            }
            pos--;
        }
        return ans;
        // for(int i=0;i<nums.length;i++){
        //     nums[i]=nums[i]*nums[i];
        // }
        // for(int i=0;i<nums.length-1;i++){
        //     int swaps=0;
        //     for(int j=0;j<nums.length-1-i;j++){
        //         if(nums[j]>nums[j+1]){
        //             int temp=nums[j];
        //             nums[j]=nums[j+1];
        //             nums[j+1]=temp;
        //             swaps++;
        //         }
        //     }
        //     if(swaps==0){
        //         break;
        //     }
        // }
        // return nums;
    }
}