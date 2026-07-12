class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double sum=0,mavg=Integer.MIN_VALUE;
        int posn=0;
        for(int i=0;i<k;i++){
            sum=sum+nums[i];
        }
        double avg=0;
        avg=sum/k;
        if(avg>mavg){
            mavg=avg;
        }
        posn++;
        while(posn<=nums.length-k){
            avg=0;
            sum=sum-nums[posn-1]+nums[posn+k-1];
            avg=sum/k;
            if(avg>mavg){
                mavg=avg;
            }
            posn++;
        }
        return mavg;
        // int i=0;
        // double mavg=Integer.MIN_VALUE;
        // while(i<=nums.length-k){
        //     double avg=0;
        //     double sum=0;
        //     for(int j=i;j<i+k;j++){
        //        sum=sum+nums[j];
        //     }
        //     avg=sum/k;
        //     if(avg>mavg){
        //         mavg=avg;
        //     }
        //     i++;
        // }
        // return mavg;
    }
}