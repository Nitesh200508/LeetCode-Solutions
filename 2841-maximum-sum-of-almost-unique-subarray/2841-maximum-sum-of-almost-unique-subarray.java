class Solution {
    public long maxSum(List<Integer> nums, int m, int k) {
        int n=nums.size();
        int i=0;
        int j=0;
        long sum = 0;
        long maxsum=0;
        HashSet<Integer> ans1 = new HashSet<>();
        while(j<n){
            sum += nums.get(j);
            ans1.add(nums.get(j));
            if(j-i+1<k){
                j++;
            }
            else if(j-i+1==k){
                if(ans1.size()>=m){
                    maxsum=Math.max(maxsum,sum);
                }
                sum-=nums.get(i);
                int remove = nums.get(i);
                boolean stillExists = false;

                for (int x = i + 1; x <= j; x++) {
                    if (nums.get(x).equals(remove)) {
                        stillExists = true;
                        break;
                    }
                }

                if (!stillExists) {
                    ans1.remove(remove);
                }
                i++;
                j++;
            }
        }
        return maxsum;
    }
}