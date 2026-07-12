class Solution {
    public List<String> summaryRanges(int[] nums) {
        ArrayList<String> ans = new ArrayList<>();

        int i = 0;

        while (i < nums.length) {

            int s = nums[i];
            int e = s;

            while (i < nums.length - 1 && nums[i + 1] == nums[i] + 1) {
                i++;
                e = nums[i];
            }

            if (s == e) {
                ans.add(String.valueOf(s));
            } else {
                ans.add(s + "->" + e);
            }

            i++;
        }

        return ans;
    }
}