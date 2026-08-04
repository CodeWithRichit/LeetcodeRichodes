class Solution {
    public List<Integer> findMissingElements(int[] nums) { 
        int f=Integer.MAX_VALUE;
        int l=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            f=Math.min(f,nums[i]);
            l=Math.max(l,nums[i]);
        }
        HashSet<Integer> set=new HashSet<>();
        List<Integer> list=new ArrayList<>();
        for(int i=f;i<=l;i++){
            set.add(i);
        }
        for(int e:set){
            int found=1;
            for(int i=0;i<nums.length;i++){
                if(nums[i]==e){
                    found=0;
                    break;
                }
            }
            if(found==1){
                list.add(e);
            }
        }
        Collections.sort(list);
        return list;
    }
}