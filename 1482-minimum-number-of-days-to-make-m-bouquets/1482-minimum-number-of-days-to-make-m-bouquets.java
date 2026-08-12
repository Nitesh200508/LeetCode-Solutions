class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        int n = bloomDay.length;

        if((long)m * k > n){
            return -1;
        }

        int l = Integer.MAX_VALUE;
        int r = Integer.MIN_VALUE;

        for(int day : bloomDay){
            l = Math.min(l,day);
            r = Math.max(r,day);
        }

        while(l < r){
            int mid = l + (r - l)/2;

            if(bouquetMade(bloomDay,m,k,mid)){
                r = mid;
            }
            else{
                l = mid + 1;
            }
        }

        return l;
    }

    private boolean bouquetMade(int[] bloomDay,int m,int k,int days){
        int flowers = 0;
        int bouquets = 0;

        for(int day : bloomDay){
            if (day <= days) {
                flowers++;

                
                if (flowers == k) {
                    bouquets++;
                    flowers = 0;
                    
                    if (bouquets >= m) {
                        return true;
                    }
                }

            } else {
                flowers = 0;
            }
        }

        return false;
    }
}