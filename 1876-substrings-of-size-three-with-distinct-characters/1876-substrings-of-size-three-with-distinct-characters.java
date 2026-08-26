class Solution {
    public int countGoodSubstrings(String s) {
        int n = s.length();

        int i = 0;
        int j = 0;
        int count = 0;
        HashMap<Character,Integer> map = new HashMap<>();

        while(j < n){
            map.put(s.charAt(j),map.getOrDefault(s.charAt(j),0)+1);
            if(j-i+1 < 3){
                j++;
            }
            else if(j - i + 1 == 3){
                // map.put(s.charAt(j),map.getOrDefault(s.charAt(j),0)+1);
                if(map.size() == 3){
                    count++;
                }
                char ch = s.charAt(i);
                map.put(ch,map.getOrDefault(ch,0)-1);
                if (map.get(ch) == 0) {
                    map.remove(ch);
                }
                i++;
                j++;
            }
        }
        return count;
    }
}