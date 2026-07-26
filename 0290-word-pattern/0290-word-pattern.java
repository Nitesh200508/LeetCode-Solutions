class Solution {
    public boolean wordPattern(String pattern, String s) {
        HashMap<Character,String> charWord=new HashMap<>();
        HashMap<String,Character> wordChar=new HashMap<>();
        String[] parts=s.split(" ");
        if(pattern.length()!=parts.length)return false;
        for(int i=0;i<parts.length;i++){
            char c=pattern.charAt(i);
            String str=parts[i];
            if(charWord.containsKey(c)){
                if(!charWord.get(c).equals(str))return false;
            }else{
                if(wordChar.containsKey(str))return false;
                charWord.put(c,str);
                wordChar.put(str,c);
            }
        }
        return true;
    }
}