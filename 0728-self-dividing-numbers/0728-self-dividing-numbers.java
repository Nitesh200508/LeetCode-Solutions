class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> ans = new ArrayList<>();
        for(int i = left;i <= right;i++){
            if(na(i) == true){
                ans.add(i);
            }
        }
        return ans;
    }
    private Boolean na(int n){
        int k = n;
        while(k > 0){
            int r = k % 10;
            if(r == 0 || n % r != 0){
                return false;
            }
            k /= 10;
        }
        return true;
    }
    
}