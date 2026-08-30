class Solution {
    public int minimumDeletions(int[] nums) {
        int n = nums.length;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int minI = -1;
        int maxI = -1;

        for(int i = 0;i < n;i++){
            if(nums[i] < min){
                min = nums[i];
                minI = i;
            }
            if(nums[i] > max){
                max = nums[i];
                maxI = i;
            }
        }

        int a = Math.min(maxI,minI);
        int b = Math.max(maxI,minI);

        int c = b + 1;
        int d = n - a;
        int e = (a + 1) + (n - b);
        return Math.min(Math.min(c,d),e);
        


    }
}