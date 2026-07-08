class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder sb = new StringBuilder();

        
        int n = word1.length();
        int m = word2.length();
        int l = Math.max(n,m);
        int flag1 = 0;
        int flag2 = 0;
        for(int i = 0;i < l;i++){
            if(flag1 != 1){
                sb.append(word1.charAt(i));
                if(i == n-1)flag1 = 1;
            }
            if(flag2 != 1){
                sb.append(word2.charAt(i));
                if(i == m - 1)flag2 = 1;
            }
            

        }
        return sb.toString();

    }
}