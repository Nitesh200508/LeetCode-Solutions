class Solution {
    public int titleToNumber(String columnTitle) {
        int ans=0;
        int n=columnTitle.length();
        for(int i=0;i<n;i++){
            int val=(columnTitle.charAt(i)-'A')+1;
            ans=ans*26+val;
        }
        return ans;
    }
}