class Solution {
    public int[] twoSum(int[] arr, int tar) {
        
        int n = arr.length;
        int arr2[][]  = new int[n][2];
        for(int i=0;i<n;i++){
            arr2[i][0] = arr[i];
            arr2[i][1] = i;
        }
        Arrays.sort(arr2,(a,b)->Integer.compare(a[0],b[0]));
        int ans[] = {-1,-1};
        int i = 0, j = n-1;

        while(i<j){
            if(arr2[i][0] + arr2[j][0] == tar){
                ans[0] = arr2[i][1];
                ans[1] = arr2[j][1];
                return ans;
            }
            else if(arr2[i][0] + arr2[j][0] > tar) j--;
            else i++;
        }
        return ans;
    }
}