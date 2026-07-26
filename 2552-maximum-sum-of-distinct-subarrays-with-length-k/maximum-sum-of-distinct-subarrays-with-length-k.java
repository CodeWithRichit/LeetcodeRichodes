class Solution {
    public long maximumSubarraySum(int[] arr, int k) {
        //Hashmap
        HashMap<Integer,Integer> map=new HashMap<>();
        long max=0;
        long sum=0;
        int dups=0;
        //k times
        for(int i=0;i<k;i++){
            if(!map.containsKey(arr[i])){
               map.put(arr[i], 1);
            }
            else{
                int fr=map.get(arr[i]);
                map.put(arr[i], fr+1);
            }
            sum=sum+arr[i];
            if(map.get(arr[i])>1){
                dups=dups+1;
            }
        }
        if(dups==0){
            max=Math.max(max, sum);
        }
        for(int i=k;i<arr.length;i++){
           if(!map.containsKey(arr[i])){
               map.put(arr[i], 1);
            }
            else{
                int fr=map.get(arr[i]);
                map.put(arr[i], fr+1);
            }
            if(map.get(arr[i])>1){
                dups=dups+1;
            }
            sum=sum-arr[i-k]+arr[i];
            if(map.get(arr[i-k])>1){
                dups--;
            }
            map.put(arr[i-k], map.get(arr[i-k]) - 1);
            if (map.get(arr[i-k]) == 0) {
                map.remove(arr[i-k]);
            }
            if(dups==0){
                max=Math.max(max, sum);
            }
        }
        return max;
        //Brute force
        // long max=0;
        // for(int i=0;i<=arr.length-k;i++){
        //     HashSet<Integer> set=new HashSet<>();
        //     long sum=0;
        //     int isDup=0;
        //     for(int j=i;j<i+k;j++){
        //        if(set.contains(arr[j])){
        //           isDup=1;
        //        }
        //        set.add(arr[j]);
        //        sum=sum+arr[j];
        //     }
        //     if(isDup==0){
        //         if(sum>=max){
        //             max=sum;
        //         }
        //     }
        //     set.remove(arr[i]);
        // }
        // return max;
    }
}