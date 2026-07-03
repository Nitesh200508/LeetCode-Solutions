class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] seen = new int[26];
        for(int i = 0;i < magazine.length();i++){

            seen[magazine.charAt(i) - 'a']++;
        }
        for(int j = 0;j < ransomNote.length();j++){
            seen[ransomNote.charAt(j) - 'a']--;
            if(seen[ransomNote.charAt(j) - 'a'] < 0){
                return false;
            } 
        }
        return true;
    }
}