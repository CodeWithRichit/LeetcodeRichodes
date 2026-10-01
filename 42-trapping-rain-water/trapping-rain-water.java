class Solution {
    public int trap(int[] nums) {
        int n=nums.length;
        int[] rm=new int[n];
        int[] lm=new int[n];
        rm[n-1]=0;
        int rmax=nums[n-1];
        for(int i=n-2;i>=0;i--){
            rm[i]=rmax;
            rmax=Math.max(rmax,nums[i]);
        }
        lm[0]=0;
        int lmax=nums[0];
        for(int i=1;i<n;i++){
            lm[i]=lmax;
            lmax=Math.max(lmax,nums[i]);
        }
        int units=0;
        for(int i=0;i<n;i++){
            units += Math.max(0, Math.min(rm[i], lm[i]) - nums[i]);        
        }
        return units;
    }
}