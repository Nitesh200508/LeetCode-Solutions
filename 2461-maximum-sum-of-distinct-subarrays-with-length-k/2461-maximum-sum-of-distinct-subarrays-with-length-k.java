class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        long sum = 0;
        long maxSum = 0;
        int i = 0;
        int j = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        int n=nums.length;
        while(j < n){
            map.put(nums[j],map.getOrDefault(nums[j],0)+1);
            sum+=nums[j];
            if(j - i + 1 < k){
                j++;
            }
            else if(j - i + 1 == k){
                if(map.size()==k){
                    maxSum=Math.max(maxSum,sum);
                }
                sum-=nums[i];
                map.put(nums[i],map.getOrDefault(nums[i],0)-1);
                if(map.get(nums[i])==0){
                    map.remove(nums[i]);
                }
                i++;
                j++;
            }
        }
        return maxSum;
    }
}