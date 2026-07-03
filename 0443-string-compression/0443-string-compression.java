class Solution {
    public int compress(char[] chars) {
        int n = chars.length;
        String ans = "";
        int count = 1;

        for(int right = 0;right < n-1;right++){
            
            if(chars[right] == chars[right+1]){
                count++;
            }
            else{
                ans += chars[right];
                if(count > 1){
                    ans += String.valueOf(count);
                }
                count = 1;
            }
        }
        ans += chars[n-1];
        if(count > 1){
            ans += count;
        }

            
        for(int right = 0;right < ans.length();right++){
            chars[right] = ans.charAt(right);
        }
        return ans.length();
        



    }
}