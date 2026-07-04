class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        boolean[] seen = new boolean[26];

        for(int i = 0;i < allowed.length();i++){
            seen[allowed.charAt(i) - 'a'] = true;
        }

        int count = 0;
        for(String word : words){
            boolean valid = true;
            for(int i = 0;i < word.length();i++){
                if(!seen[word.charAt(i) - 'a']){
                    valid = false;
                    break;
                }
            }
            if(valid){
                count++;
            }
        }
        return count;
    }
}