class Solution {
    
    public String[] findWords(String[] words) {
        String fr = "qwertyuiop";
        String sr = "asdfghjkl";
        String tr = "zxcvbnm";

        List<String> ans = new ArrayList<>();

        for (String word1 : words) {
            int fcount = 0;
            int scount = 0;
            int tcount = 0;

            String word = word1.toLowerCase();

            for (int i = 0; i < word.length(); i++) {
                char ch = word.charAt(i);

                if (fr.indexOf(ch) != -1) {
                    fcount++;
                } else if (sr.indexOf(ch) != -1) {
                    scount++;
                } else if (tr.indexOf(ch) != -1) {
                    tcount++;
                }
            }

            if (word.length() == fcount ||
                word.length() == scount ||
                word.length() == tcount) {
                ans.add(word1);
            }
        }

        return ans.toArray(new String[0]);
    }
}