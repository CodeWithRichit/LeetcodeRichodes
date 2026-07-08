class Solution {
    public int removeDuplicates(int[] nums) {
        int k=0,j=0,i=0;
        int posn=0;
        while(j<nums.length){
            int count=0;
            while(j<nums.length && nums[i]==nums[j]){
                count=j-i;
                j++;
            }
            if(count==0){
                nums[posn]=nums[i];
                posn++;
            }
            else{
                for(int l=0;l<2;l++){
                    nums[posn]=nums[i];
                    posn++;
                }
            }
            i=j;
        }
        return posn;
    }
}