class Solution {
    public List<Integer> majorityElement(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int n=nums.length;
        int s=n/3;
        List<Integer> ans=new ArrayList<>();
        for(int x:nums){
            map.put(x,map.getOrDefault(x,0)+1);
        }
        for(int x:nums){
            int freq=map.get(x);
            if(freq>s){
                if(!ans.contains(x)){
                    ans.add(x);
                }
            }
        }
        return ans;
    }
}