class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m=nums2.length;
        int[] nums3 = new int[n+m];
        double ans = 0;
        int i=0;
        int j=0;
        int k=0;
        while(i<n && j<m){
            if(nums1[i]>nums2[j]){
                nums3[k]=nums2[j];
                k++;
                j++;
            }
            else{
                nums3[k]=nums1[i];
                k++;
                i++;
            }
        }
        while(i<n){
            nums3[k]=nums1[i];
            i++;
            k++;
        }
        while(j<m){
            nums3[k]=nums2[j];
            j++;
            k++;
        }
        if(nums3.length%2==0){
            ans = (nums3[nums3.length/2] + nums3[nums3.length/2-1])/2.0;
        }
        else{
            ans = nums3[(n+m)/2];
        }
        return ans;
    }
}