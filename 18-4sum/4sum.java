class Solution {
    public List<List<Integer>> fourSum(int[] nums, int t) {
        Arrays.sort(nums);
        List<List<Integer>> list=new ArrayList<>();
        for(int i=0;i<=nums.length-4;i++){
            if(i>0 && nums[i]==nums[i-1]) continue;
            for(int j=i+1;j<=nums.length-3;j++){
                if(j>i+1 && nums[j]==nums[j-1]) continue;
                int lo=j+1,hi=nums.length-1;
                while(lo<hi){
                    long sum = (long) nums[i] + nums[j] + nums[lo] + nums[hi];
                    if(sum==t){
                       List<Integer> li=new ArrayList<>();
                       li.add(nums[i]);
                       li.add(nums[j]);
                       li.add(nums[lo]);
                       li.add(nums[hi]);
                       list.add(li);
                       lo++;
                       hi--;
                       while (lo<hi && nums[lo-1]==nums[lo]) lo++;
                       while (lo<hi && nums[hi+1]==nums[hi]) hi--;
                    }
                    else if(nums[i]+nums[j]+nums[lo]+nums[hi]<t){
                        lo=lo+1;
                    }
                    else{
                        hi=hi-1;
                    }
                }
            }
        }
        return list;
    }
}