class Solution {
    public int countKDifference(int[] nums, int k) {
        int count=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int n:nums){
            count+=map.getOrDefault(n-k,0);
            count+=map.getOrDefault(n+k,0);
            map.put(n,map.getOrDefault(n,0)+1);
        }
        return count;
    }
}