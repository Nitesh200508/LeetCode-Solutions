class Solution {
    public boolean detectCapitalUse(String word) {
        int up = 0;
        int n = word.length();
        for(int i = 0;i < n;i++){
            if(Character.isUpperCase(word.charAt(i))){
                up++;
            }
        }
        if(up == word.length()){
            return true;
        }
        else if(up == 0){
            return true;
        }
        else if(up == 1 && word.charAt(0)>='A' && word.charAt(0) <= 'Z'){
            return true;
        }
        else{
            return false;
        }
    }
}