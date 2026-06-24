class Solution {
    boolean check(int[][] mat,int x,int y){
        int n=mat.length;
        int m=mat[0].length;
        if(x>=0 && x<n && y>=0 && y<m){
            return true;
        }
        return false;
    }
    public int[][] imageSmoother(int[][] img) {
        int n = img.length;
        int m = img[0].length;
        int[][] ans=new int[n][m];
        int sum=0;
        int avg=0;
        int [] dx = {1,1,1,0,-1,-1,-1,0};
        int [] dy = {1,0,-1,-1,-1,0,1,1};

        for(int i = 0;i < n;i++){
            for(int j = 0;j < m;j++){
                int count=1;
                sum=img[i][j];
                for(int k=0;k<8;k++){
                    int ni=i+dx[k];
                    int nj=j+dy[k];
                    if(check(img,ni,nj)){
                        sum+=img[ni][nj];
                        count++;
                    }
                }
                ans[i][j]=sum/count;
            }
        }
        return ans;
    }
}