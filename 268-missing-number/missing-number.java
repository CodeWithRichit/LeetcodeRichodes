class Solution {
    public int missingNumber(int[] nums) {
        int l=nums.length;
        int sum=l*(l+1)/2;
        int sa=0;
        for(int i=0;i<=l-1;i++){
            sa=sa+nums[i];
        }
        return sum-sa;
    }
}