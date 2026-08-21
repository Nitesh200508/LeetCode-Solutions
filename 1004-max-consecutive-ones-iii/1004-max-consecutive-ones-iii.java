class Solution {
    public int longestOnes(int[] nums, int k) {
        int n=nums.length;
        int j=0;
        int maxcount=0;
        int count=0;
        for(int i=0;i<n;i++){
            if(nums[i]==0){
                count++;
            }
            while(count>k){
                if(nums[j]==0){
                    count--;
                }
                j++;
            }
            maxcount = Math.max(maxcount,i-j+1);
        }
        return maxcount;
    }
}