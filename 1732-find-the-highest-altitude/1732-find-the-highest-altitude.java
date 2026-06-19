class Solution {
    public int largestAltitude(int[] gain) {
        int high = 0;
        int maxh = 0;
        for(int i:gain){
            high+=i;
            maxh = Math.max(high,maxh);
        }
        return maxh;
    }
}