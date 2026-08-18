class Solution {
    static boolean canplace(int[] arr ,int m,int target){
        int count=1;
        int lastball=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]-lastball>=target){
                count++;
                lastball=arr[i];
            }
            if(count==m){
                return true;
            }
        }
        return false;
    }
    public int maxDistance(int[] position, int m) {
        Arrays.sort(position);
        int low=0;
        int high=position[position.length-1]-position[0];
        int answer=0;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(canplace(position,m,mid)){
                answer=mid;
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return answer;
    }
}