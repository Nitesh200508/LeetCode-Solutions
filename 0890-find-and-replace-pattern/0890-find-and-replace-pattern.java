class Solution {
    public boolean isIsomorphic(String s, String t) {
        int n = s.length();
        for(int i = 0;i < n;i++){
            if(s.indexOf(s.charAt(i))!=t.indexOf(t.charAt(i))){
                return false;
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