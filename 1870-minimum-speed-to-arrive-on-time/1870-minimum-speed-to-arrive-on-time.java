class Solution {
    public int minSpeedOnTime(int[] dist, double hour) {

        int low = 1;
        int high = 10_000_000;

        if (time(dist, high) > hour) {
            return -1;
        }

        while (low < high) {

            int mid = low + (high - low) / 2;

            if (time(dist, mid) <= hour) {
                high = mid;
            } else {
                low = mid + 1;
            }
        }

        return low;
    }

    private double time(int[] dist, int speed) {

        double total = 0;

        for (int i = 0; i < dist.length; i++) {
            if (i == dist.length - 1) {
                total += (double) dist[i] / speed;
            } else {                
                total += Math.ceil((double) dist[i] / speed);
            }
        }

        return total;
    }
}