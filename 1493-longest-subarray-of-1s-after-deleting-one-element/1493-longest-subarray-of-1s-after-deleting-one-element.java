class Solution {
    public int longestSubarray(int[] nums) {
        int n = nums.length;
        int i=0;
        int count=0;
        int maxcount=0;
        for(int j=0;j<n;j++){
            if(nums[j]==0){
                count++;
            }
            while(count>1){
                if(nums[i]==0){
                    count--;
                }
                i++;
            }
            maxcount=Math.max(maxcount,j-i);
        }
        return maxcount;
    }
}