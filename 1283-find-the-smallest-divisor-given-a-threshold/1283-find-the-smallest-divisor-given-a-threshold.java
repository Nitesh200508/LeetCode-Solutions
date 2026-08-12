class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int l = 1;
        int r = 1;
        
        for(int x : nums){
            r = Math.max(r,x);
        }        

        while(l < r){
            int mid = l + (r - l)/2;

            int ans = Threshold(nums,mid);
            if(ans <= threshold){
                
                r = mid;
            }else{
                l = mid + 1;
            }
        }
        return r;
        
    }

    int Threshold(int[] arr,int mid){
        int sum = 0;
        for(int x : arr){
            sum += (x + mid - 1)/mid;
        }

        return sum;
    }
}