class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> list=new ArrayList<>();
        for(int i=0;i<candies.length;i++){
            int tc=candies[i]+extraCandies;
            int yes=1;
            for(int j=0;j<candies.length;j++){
                if(candies[j]>tc){
                    list.add(false);
                    yes=0;
                    break;
                }
            }
            if(yes==1){
            list.add(true);
            }
        }
        return list;
    }
}