class Solution {
    int helper(int[] nums,int k){
        int n = nums.length;
        if(k < 0) return 0;
        int i = 0;
        int j = 0;

        int sum = 0;
        int cnt = 0; 
        while(j < n){
            sum += nums[j];
            while(sum > k){
                sum -= nums[i];
                i++;
            }
            
            cnt += j - i + 1;
            j++;

        }
        return cnt;
    }
    public int numberOfSubarrays(int[] nums, int k) {
        for(int i = 0;i < nums.length;i++){
            if(nums[i] % 2 == 0){
                nums[i] = 0;
            }
            else{
                nums[i] = 1;
            }
        }
        return helper(nums,k) - helper(nums,k - 1);
    }
}