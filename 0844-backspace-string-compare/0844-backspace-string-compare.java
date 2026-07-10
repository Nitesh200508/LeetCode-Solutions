class Solution {
    public boolean backspaceCompare(String s, String t) {
        int n = s.length();
        int m = t.length();

        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();

        for(char c : s.toCharArray()){
            if(c!= '#'){
                sb1.append(c);
            }
            else if(sb1.length() >= 1){
                sb1.deleteCharAt(sb1.length() - 1);
            }
        }
        for(char c : t.toCharArray()){
            if(c!= '#'){
                sb2.append(c);
            }
            else if(sb2.length() >= 1){
                sb2.deleteCharAt(sb2.length() - 1);
            }
        }

        return sb1.toString().equals(sb2.toString());

    }
}