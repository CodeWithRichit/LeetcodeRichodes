class Solution {
    public int maxArea(int[] nums) {
        int i=0,j=nums.length-1;
        int ma=0;
        while(i<j){
           int l=0; 
           if(nums[j]>nums[i]){l=nums[i];}
           else{l=nums[j];}
           int h=j-i;
           int area=l*h;
           if(area>ma){
            ma=area;
           }
           if(nums[i]<nums[j]){
            i++;
           }
           else{
            j--;
           }
           }
        return ma;
        }

}