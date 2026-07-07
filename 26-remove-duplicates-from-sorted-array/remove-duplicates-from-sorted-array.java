class Solution {
    public int removeDuplicates(int[] nums) {
        int count=0;
        for(int i=0;i<nums.length;i++){
            int y=0;
            for(int j=0;j<i;j++){
                if(nums[j]==nums[i]){
                    y=1;
                    break;
                }
            } 
            if(y==0){
            count++;
            }
        }
        int i=0,j=1,pos=0;
        while(j<nums.length){
            if(nums[i]==nums[j]){
                j++;
            }
            else if(nums[i]!=nums[j]){
                nums[pos]=nums[i];
                pos++;
                i=j;
            }
        }
        nums[pos] = nums[i];
        return count;
    }
}