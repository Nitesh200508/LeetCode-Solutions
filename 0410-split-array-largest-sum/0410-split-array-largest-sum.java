class Solution {
    public int splitArray(int[] nums, int k) {
        int low = 0;
        int high = 0;
        
        for(int i : nums){
            low = Math.max(low,i);
            high += i;
        }

        while(low < high){
            int mid = low + (high - low)/2;

            if(isValid(nums,mid,k)){
                high = mid;
            }
            else{
                low = mid + 1;
            }
        }
        return low;

    }
    private boolean isValid(int[] arr,int mid,int k){
        int sum = 0;
        int count = 1;
        for(int n : arr){
            if(sum + n > mid){
                sum = 0;
                count++;
            }
            sum += n;
        }
        return count <= k;
    }
}