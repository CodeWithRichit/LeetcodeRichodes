class Solution {
    public int maxFrequency(int[] nums, int k) {
        Arrays.sort(nums);
        int i=0,j=0,max=1,r=k;
        long sum=0;
        while(j<nums.length){
            sum = sum + nums[j];
            while ((long) nums[j] * (j - i + 1) - sum > k) {
                sum -= nums[i];
                i++;
            }
            max = Math.max(max, j - i + 1);
            j++;
        }
        return max;
        // Arrays.sort(nums);
        // int l=nums[nums.length-1];
        // for(int i=nums.length-2;i>=0;i--){
        //     if(l-nums[i]<=k){
        //         k = k - (l - nums[i]);
        //         nums[i]=nums[i]+(l-nums[i]);
        //     }
        // }
        // HashMap<Integer,Integer> map=new HashMap<>();
        // for (int num : nums) {
        //     map.put(num, map.getOrDefault(num, 0) + 1);
        // }
        // int ans = 0;
        // for(int e : map.keySet()){
        //     ans = Math.max(ans, map.get(e));
        // }
        // return ans;
    }
}