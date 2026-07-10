class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int diff=Integer.MAX_VALUE;
        int close=Integer.MAX_VALUE;
        int i=0,j=0;
        for(i=0;i<nums.length;i++){
            j=i+1;
            int k=nums.length-1;
            while(j<k){
                int sum=nums[i]+nums[j]+nums[k];
                int n=sum-target;
                if(Math.abs(n)<diff){
                    diff=Math.abs(n);
                    close=nums[i]+nums[j]+nums[k];
                }
                if(sum>target){
                    k--;
                }
                else if(sum<target){
                    j++;
                }
                else{
                    return close;
                }
            }
        }
        return close;
    }
}