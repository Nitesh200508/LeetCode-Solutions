class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> dict = new HashMap<>();

        for(int i = 0;i < nums.length;i++){
            int value = target - nums[i];

            if(dict.containsKey(value)){
                return new int[]{dict.get(value),i};
            }
            dict.put(nums[i],i);
        }
        return new int[]{};

    }
}