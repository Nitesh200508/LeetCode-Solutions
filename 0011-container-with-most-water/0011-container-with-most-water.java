class Solution {
    public int maxArea(int[] height) {
        int l = 0;
        int r = height.length - 1;
        int best = 0;

        while(l < r){
            int area = Math.min(height[l],height[r]) * (r - l);
            best = Math.max(best,area);

            if(height[l] < height[r]){
                l++;
            }
            else{
                r--;
            }
        }
        return best;
    }
}