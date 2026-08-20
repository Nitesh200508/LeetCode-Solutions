class Solution {
    public int maxWidthRamp(int[] nums) {

        int n = nums.length;
        int max = 0;

        int[] stack = new int[n];
        int top = -1;

        for (int i = 0; i < n; i++) {

            if (top == -1 || nums[stack[top]] > nums[i]) {
                stack[++top] = i;
            }
        }

        for (int j = n - 1; j >= 0; j--) {

            while (top >= 0 && nums[stack[top]] <= nums[j]) {

                max = Math.max(max, j - stack[top]);
                top--;
            }
        }

        return max;
    }
}