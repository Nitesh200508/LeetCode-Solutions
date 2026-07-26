class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder sb=new StringBuilder();
        int par=0;
        for(char c:s.toCharArray()){
            if(c=='('){
                if(par>0)sb.append(c);
                par++;
            }
            else{
                par--;
                if(par>0)sb.append(c);
            }
        }
        return sb.toString();
    }
}