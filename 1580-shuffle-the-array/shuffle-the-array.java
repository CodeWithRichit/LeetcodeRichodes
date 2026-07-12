class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] arr=Arrays.copyOf(nums,nums.length);
        int i=0,j=n,posn=0;
        for(i=0;i<n;i++){
            nums[posn]=arr[i];
            posn++;
            nums[posn]=arr[j];
            posn++;
            j++;
        }
        return nums;
    }
}