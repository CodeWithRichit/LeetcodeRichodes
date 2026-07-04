class Solution {
    public int maxProfit(int[] nums) {
        int maxProfit=0;
        int minp=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<minp){
                minp=nums[i];
            }
            else if(nums[i]-minp>maxProfit){
                maxProfit=nums[i]-minp;
            }
        }
        return maxProfit;
        // int max=Integer.MIN_VALUE;
        // for(int i=0;i<nums.length-1;i++){
        //     for(int j=i+1;j<nums.length;j++){
        //         if(nums[j]-nums[i]>max){
        //             max=nums[j]-nums[i];
        //         }
        //     }
        // }
        // if(max<=0){
        //     return 0;
        // }
        // else{
        //     return max;
        // }
    }
}