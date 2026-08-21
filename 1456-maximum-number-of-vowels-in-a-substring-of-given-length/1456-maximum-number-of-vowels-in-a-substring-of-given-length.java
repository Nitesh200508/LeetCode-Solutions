class Solution {
    public int maxVowels(String s, int k) {
        int n = s.length();
        int i=0;   
        int j=0;
        int count=0;
        int maxcount=0;
        String str = "aeiou";
        while(j<n){
            if(str.indexOf(s.charAt(j))!=-1){
                count++;
            }
            if(j-i+1<k){
                j++;
            }
            else if(j-i+1==k){
                maxcount=Math.max(maxcount,count);
                if(str.indexOf(s.charAt(i))!=-1){
                    count--;
                }
                i++;
                j++;
            }
        }
        return maxcount;
    }
}