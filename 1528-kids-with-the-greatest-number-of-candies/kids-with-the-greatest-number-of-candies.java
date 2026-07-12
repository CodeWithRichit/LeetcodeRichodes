class Solution {
    public List<Boolean> kidsWithCandies(int[] arr, int ec) {
        List<Boolean> l=new ArrayList<>();
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]+ec>=max){
               l.add(true);
            }
            else{
                l.add(false);
            }
        }
        return l;
    }
}