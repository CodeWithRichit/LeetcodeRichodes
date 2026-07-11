class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i=0,j=0,posn=0;
        int[] arr=Arrays.copyOf(nums1,m);
        while(i<m && j<n){
            if(arr[i]<nums2[j]){
               nums1[posn]=arr[i];
               i++;
            }
            else if(arr[i]>nums2[j]){
                nums1[posn]=nums2[j];
                j++;
            }
            else{
                nums1[posn]=arr[i];
                i++;
            }
            posn++;
        }
        while(i<m){
            nums1[posn]=arr[i];
            posn++;
            i++;
        }
        while(j<n){
            nums1[posn]=nums2[j];
            posn++;
            j++;
        }
    }
}