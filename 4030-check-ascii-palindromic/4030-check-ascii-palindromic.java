class Solution {
    public boolean isPalindromic(String s) {
      String binary = "";
      for(int i=0;i<s.length();i++){
          int ascii = (int)(s.charAt(i));
          String bin = String.format("%8s",Integer.toBinaryString(ascii)).replace(' ','0');
          binary += bin;
      }
      int j=0;
      int k=binary.length()-1;
        while(j<k){
            if(binary.charAt(j)!=binary.charAt(k)){
                return false;
            }
            j++;
            k--;
        }
        return true;
    }
}