class Solution {
    public int minimumRecolors(String blocks, int k) {
        int i=0;
        int j=0;
        int n=blocks.length();
        int mincount=Integer.MAX_VALUE;
        int count=0;
        while(j<n){
            if(blocks.charAt(j)=='W'){
                count++;
            }
            if(j-i+1<k){
                j++;
            }
            else if(j-i+1==k){
                mincount=Math.min(mincount,count);
                if(blocks.charAt(i)=='W'){
                    count--;
                }
                i++;
                j++;
            }
        }
        return mincount;
    }
}