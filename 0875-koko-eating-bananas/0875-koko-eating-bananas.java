class Solution {
    long hour(int[] piles,int mid){
        long hours = 0;
        for(int num : piles){
            hours += (num + (long)mid - 1)/mid;
        }
        return hours;
    }
    public int minEatingSpeed(int[] piles, int h) {
        int max = 0;
        for(int x : piles){
            max = Math.max(max,x);
        }
        int l = 1;
        int r = max;

        while(l < r){
            int mid = l + (r-l)/2;
            long hours = hour(piles,mid);
            if(hours <= h){
                r = mid;
            }else{
                l = mid + 1;
            }
        }
        return l;

    }
}