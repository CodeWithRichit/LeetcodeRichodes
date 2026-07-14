class Solution {
    public int[] twoSum(int[] nums, int t) {
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[j]+nums[i]==t){
                   return new int[]{i, j};
                }
            }
        }
        return new int[]{};
    }
    }
