class Solution {
    public boolean isIsomorphic(String s, String t) {
        int n = s.length();
        for(int i = 0;i < n-1;i++){
            for(int j = i+1;j < n;j++){

                if(s.charAt(i) == s.charAt(j) && t.charAt(i) != t.charAt(j)){
                    
                    return false;
                }
                if(s.charAt(i) != s.charAt(j) && t.charAt(i) == t.charAt(j)){
                    
                    return false;
                }
            }
        }
        return true;
    }
    public List<String> findAndReplacePattern(String[] words, String pattern) {
        List<String> ans = new ArrayList<>();

        for (int i = 0; i < words.length; i++) {
            if (isIsomorphic(words[i], pattern)) {
                ans.add(words[i]);
            }
        }

        return ans;
    }
}