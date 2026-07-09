import java.util.Arrays;
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> arr = new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length && nums[i]<=0;i++){
            if(i>0 && nums[i]==nums[i-1]) continue;
            int j=i+1,k=nums.length-1;
            while(i<j && j<k){
            if(nums[i]+nums[j]+nums[k]==0){
               List<Integer> triplet = new ArrayList<>();
                triplet.add(nums[i]);
                triplet.add(nums[j]);
                triplet.add(nums[k]);
                arr.add(triplet);
                j++;
                k--;
                while(j<k && nums[j]==nums[j-1]) j++;
                while(j<k && nums[k]==nums[k+1]) k--;
            }
            else if(nums[i]+nums[j]+nums[k]>0){
                k--;
            }
            else{
                j++;
            }
        }
        }
        return arr;
    }
}

// int k;
        // for(int i=0;i<nums.length-2;i++){
        //     for(k=i+2;k<nums.length;k++){
        //         for(int j=i+1;j<k;j++){
        //             if(nums[i]+nums[j]+nums[k]==0){
        //                 List<Integer> triplet = new ArrayList<>();
        //                 triplet.add(nums[i]);
        //                 triplet.add(nums[j]);
        //                 triplet.add(nums[k]);
        //                 Collections.sort(triplet);
        //                 if(!arr.contains(triplet)){
        //                    arr.add(triplet); 
        //                 }
        //             }
        //         }
        //     }
        // }