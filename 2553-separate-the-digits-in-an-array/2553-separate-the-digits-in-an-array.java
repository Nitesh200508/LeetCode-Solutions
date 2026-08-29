class Solution {
    int[] digits(int n){
        int len = String.valueOf(n).length();
        int arr[] = new int[len];
        int i=0;
        while(n>0){
            int rem = n%10;
            arr[i++]=rem;
            n/=10;
        }
        int l = 0;
        int r = arr.length - 1;
        while (l < r) {
            int temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp;
            l++;
            r--;
        }
        return arr;
    }
    public int[] separateDigits(int[] nums) {
        int n = nums.length;
        int size = 0;
        for (int i = 0; i < n; i++) {
            size += String.valueOf(nums[i]).length();
        }
        int[] ans = new int[size];
        int idx = 0;
        for (int i = 0; i < n; i++) {
            int[] arr = digits(nums[i]);
            for (int j = 0; j < arr.length; j++) {
                ans[idx++] = arr[j];
            }
        }
        return ans;
    }
}