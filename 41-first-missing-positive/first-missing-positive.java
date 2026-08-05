class Solution {
    public int firstMissingPositive(int[] nums) {
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
        }
        for(int i=1;i<Integer.MAX_VALUE;i++){
            if(!set.contains(i)){
                return i;
            }
        }
        // for(int i=1;i<Integer.MAX_VALUE;i++){
        //     int f=0;
        //     for(int j=0;j<nums.length;j++){
        //         if(i==nums[j]){
        //             f=1;
        //             break;
        //         }
        //     }
        //     if(f==0){
        //         return i;
        //     }
        // }
        return 1;
    }
}