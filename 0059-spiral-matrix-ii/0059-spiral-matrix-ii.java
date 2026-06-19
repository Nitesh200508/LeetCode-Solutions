class Solution {
    public int[][] generateMatrix(int n) {
        int[][] ans=new int[n][n];
        int t=0,b=n-1,r=n-1,l=0;
        int count=1;
        while(t<=b && l<=r){
            for(int i=l;i<=r;i++){
                ans[t][i]=count;
                count++;
            }
            t++;
            for(int i=t;i<=b;i++){
                ans[i][r]=count;
                count++;
            }
            r--;
            if(t<=b){
                for(int i=r;i>=l;i--){
                    ans[b][i]=count;
                    count++;
                }
                b--;
            }
            if(l<=r){
                for(int i=b;i>=t;i--){
                    ans[i][l]=count;
                    count++;
                }
                l++;
            }
        }
        return ans;
    }
}