class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        double sum=0,avg=0;
        int posn=0,c=0;
        for(int i=0;i<k;i++){
            sum=sum+arr[i];
        }
        avg=sum/k;
        if(avg>=threshold){
           c++;
        }
        posn++;
        while(posn<=arr.length-k){
            avg=0;
            sum=sum-arr[posn-1]+arr[posn+k-1];
            avg=sum/k;
            if(avg>=threshold){
               c++;
            }
            posn++;
        }
        return c;
    }
}