class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i=m-1,j=n-1,posn=m+n-1;
        while(i>=0 && j>=0){
            if(nums1[i]>nums2[j]){
                nums1[posn]=nums1[i];
                i--;
            }
            else if(nums1[i]<nums2[j]){
                nums1[posn]=nums2[j];
                j--;
            }
            else{
                nums1[posn]=nums1[i];
                i--;
            }
            posn--;
        }
        while(i>=0){
            nums1[posn]=nums1[i];
            posn--;
            i--;
        }
        while(j>=0){
            nums1[posn]=nums2[j];
            posn--;
            j--;
        }
        // int i=0,j=0,posn=0;
        // int[] arr=Arrays.copyOf(nums1,m);
        // while(i<m && j<n){
        //     if(arr[i]<nums2[j]){
        //        nums1[posn]=arr[i];
        //        i++;
        //     }
        //     else if(arr[i]>nums2[j]){
        //         nums1[posn]=nums2[j];
        //         j++;
        //     }
        //     else{
        //         nums1[posn]=arr[i];
        //         i++;
        //     }
        //     posn++;
        // }
        // while(i<m){
        //     nums1[posn]=arr[i];
        //     posn++;
        //     i++;
        // }
        // while(j<n){
        //     nums1[posn]=nums2[j];
        //     posn++;
        //     j++;
        // }
    }
}