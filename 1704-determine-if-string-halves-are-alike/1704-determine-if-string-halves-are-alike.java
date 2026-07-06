class Solution {
    public boolean halvesAreAlike(String s) {
        String str= "aeiouAEIOU";
        
        int n = s.length();
        int s1count = 0;
        int s2count = 0;
        for(int i = 0;i < n/2;i++){
            if(str.indexOf(s.charAt(i)) != -1){
                s1count++;
            }
        }
        for(int i = n/2;i < n;i++){
            if(str.indexOf(s.charAt(i)) != -1){
                s2count++;
            }
        }
        if(s1count != s2count){
            return false;
        }
        return true;
    }
}