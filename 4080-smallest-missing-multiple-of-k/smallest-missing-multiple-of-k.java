class Solution {
    public int missingMultiple(int[] nums, int k) {
        int n=nums.length;
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<n;i++){
            set.add(nums[i]);
        }
        int v=0;
        int ans=0;
        for(int i=1;i<=n;i++){
            if(!set.contains(k*i)){
                v=1;
                ans=k*i;
                break;
            }
        }
        if(v==1){
            return ans;
        }
        else if(v==0){
            return k*(n+1);
        }
        return k;
    }
}