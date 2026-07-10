class Solution {
    public String licenseKeyFormatting(String s, int k) {
        StringBuilder sb = new StringBuilder();
        StringBuilder ans = new StringBuilder();

        String str = s.toUpperCase();
        int count = 0;


        for(char c : str.toCharArray()){
            if(c != '-'){
                sb.append(c);
            }
        }
        int n = sb.length() - 1;
        for(int i = n;i >= 0;i--){
            ans.append(sb.charAt(i));
            count++;
            if(count == k && i != 0){
                ans.append("-");
                count = 0;
            }
        }
        return ans.reverse().toString();

    }
}