class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
               int f=map.get(nums[i]);
               map.put(nums[i],f+1);
            }
            else{
                map.put(nums[i],1);
            }
        }
        int m=0;
        int ans=0;
        for(int e:map.keySet()){
            if(map.get(e)>m){
                m=map.get(e);
                ans=e;
            }
        }
        return ans;
    }
}