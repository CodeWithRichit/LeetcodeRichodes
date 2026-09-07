class Solution {
    public int singleNumber(int[] nums) {
    //  Arrays.sort(nums);
    //  for(int i=0;i<nums.length;i=i+3){
    //     if(i+2>=nums.length || nums[i]!=nums[i+2]){
    //         return nums[i];
    //     }
    //  }
    //  return 0;
    HashMap<Integer,Integer> map=new HashMap<>();
    for(int i=0;i<nums.length;i++){
        if(!map.containsKey(nums[i])){
            map.put(nums[i],1);
        }
        else{
            int f=map.get(nums[i]);
            map.put(nums[i],f+1);
        }
    }
    for(int e:map.keySet()){
        if(map.get(e)!=3){
            return e;
        }
    }
    return 0;
}
}
//2 2 2 3