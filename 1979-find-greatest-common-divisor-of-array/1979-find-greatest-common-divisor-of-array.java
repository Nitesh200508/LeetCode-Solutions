class Solution {
    public int findGCD(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int num = nums[0];
        int ans = 1;
        for(int i=1;i<=nums[0];i++){
            if(nums[0] % i == 0 && nums[n-1]%i==0){
                ans = i;
            }
        }
        return ans;
    }
}