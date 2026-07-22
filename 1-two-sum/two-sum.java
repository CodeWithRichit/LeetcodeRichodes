class Solution {
    public int[] twoSum(int[] nums, int t) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int d=t-nums[i];
            if(map.containsKey(d)){
                return new int[]{map.get(d),i};
            }
            map.put(nums[i],i);
        }

        // for(int i=0;i<nums.length;i++){
        //     for(int j=i+1;j<nums.length;j++){
        //         if(nums[j]+nums[i]==t){
        //            return new int[]{i, j};
        //         }
        //     }
        // }
        return new int[]{};
    }
    }
