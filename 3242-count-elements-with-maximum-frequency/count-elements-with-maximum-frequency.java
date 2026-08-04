class Solution {
    public int maxFrequencyElements(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i],map.get(nums[i])+1);
            }
            else{
                map.put(nums[i],1);
            }
        }
        int max=1;
        for(int e:map.keySet()){
            if(map.get(e)>=max){
                max=map.get(e);
            }
        }
        int c=0;
        for(int e:map.keySet()){
            if(map.get(e)==max){
                c++;
            }
        }
        return c*max;
    }
}