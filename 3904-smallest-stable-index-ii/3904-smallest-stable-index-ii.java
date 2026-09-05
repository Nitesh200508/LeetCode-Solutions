class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int big=Integer.MIN_VALUE;
        int sml=Integer.MAX_VALUE;
        int n=nums.length;
        int[] great=new int[n];
        int[] small=new int[n];
        for(int i=0;i<n;i++){
            big=Math.max(big,nums[i]);
            great[i]=big;
        }
        for(int i=n-1;i>=0;i--){
            sml=Math.min(sml,nums[i]);
            small[i]=sml;
        }
        for(int i=0;i<n;i++){
            int a=great[i]-small[i];
            if(a<=k)return i;
        }
        return -1;
    }
}