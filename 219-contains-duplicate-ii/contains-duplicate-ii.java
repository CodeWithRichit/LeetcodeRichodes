class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int freq=0;
        for(int i=0;i<=k && i<nums.length;i++){
            if(!map.containsKey(nums[i])){
                map.put(nums[i],1);
            }
            else{
                int f=map.get(nums[i]);
                map.put(nums[i],f+1);
            }
            if(map.get(nums[i])>1){
                return true;
            }
        }
        // if(freq>=1){
        //     return true;
        // }
        for(int i=k+1;i<nums.length;i++){
            map.put(nums[i-k-1],map.get(nums[i-k-1])-1);
            if(map.get(nums[i-k-1])==0){
                map.remove(nums[i-k-1]);
            }
            if(!map.containsKey(nums[i])){
                map.put(nums[i],1);
            }
            else{
                int f=map.get(nums[i]);
                map.put(nums[i],f+1);
            }
            if(map.get(nums[i])>1){
                return true;
            }
        }
        return false;
    }
}