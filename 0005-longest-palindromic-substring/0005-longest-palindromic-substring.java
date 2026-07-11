class Solution {
    public String check(int l , int r , String s){
        while(l >= 0 && r < s.length() && s.charAt(l) ==  s.charAt(r)){
           l--;
           r++;
        }
        return s.substring(l+1 , r);
    }
    public String longestPalindrome(String s) {
         String max_str = "";
        int max_len = -1;
        if(s.length() <= 1) return s;
        for(int i = 0 ; i < s.length()-1 ; i++ ){
            String even = check(i , i+1 , s);
            String odd = check(i , i , s);
            if(even.length() > max_len){
                 max_len = even.length();
                 max_str = even;
            }
            if(odd.length() > max_len){
                 max_len = odd.length();
                 max_str = odd;
            }
        }
        return max_str;
    }
}