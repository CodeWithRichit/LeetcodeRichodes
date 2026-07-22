class Solution {
    public int singleNumber(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int ans=1;
        for(int e:nums){
            if(map.containsKey(e)){
                int f=map.get(e);
                map.put(e,f+1);
            }
            else{
                map.put(e,1);
            }
        }
        for(int e:map.keySet()){
            if(map.get(e)==1){
                ans=e;
            }
        }
        // int ans=-1;
        // for(int i=0;i<nums.length;i++){
        //     int r=1;
        //     int l=1;
        //    for(int j=0;j<i;j++){
        //     if(nums[i]==nums[j]){
        //         r=0;
        //         break;
        //     }
        //    }
        //    for(int k=i+1;k<nums.length;k++){
        //      if(nums[i]==nums[k]){
        //         l=0;
        //         break;
        //     }
        //    }
        //    if(r==1 && l==1){
        //     ans=nums[i];
        //    }
        // }
        return ans;
    }
}