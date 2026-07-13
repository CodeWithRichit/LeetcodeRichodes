class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] arr=new int[nums1.length+nums2.length];
        int i=0,j=0,posn=0;
        double mean=0.00000;
        while(i<nums1.length && j<nums2.length){
            if(nums1[i]<nums2[j]){
                arr[posn]=nums1[i];
                i++;
            }
            else if(nums1[i]>nums2[j]){
                arr[posn]=nums2[j];
                j++;
            }
            else{
                arr[posn]=nums1[i];
                i++;
            }
            posn++;
        }
        while(i<nums1.length){
            arr[posn]=nums1[i];
            posn++;
            i++;
        }
        while(j<nums2.length){
            arr[posn]=nums2[j];
            posn++;
            j++;
        }
        if(arr.length%2!=0){
            mean=(double)arr[arr.length/2];
        }
        else{
            double sum=arr[(arr.length/2)-1]+arr[(arr.length/2)];
            mean=sum/2;
        }
        return mean;
    }
}