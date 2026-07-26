class Solution {
    public int myAtoi(String s) {
        double ans=0;
        int neg=1;
        int i=0;
        int n=s.length();
        while(i<n && s.charAt(i)==' ')i++;
        if(i==n)return (int)ans;
        if(s.charAt(i)=='-'){
            neg=-1;
            i++;
        }else if(s.charAt(i)=='+')i++;
        for(int j=i;j<n;j++){
            if(Character.isDigit(s.charAt(j))){
                ans=ans*10+(s.charAt(j)-'0');
            }else{
                break;
            }
        }
        if(ans>Integer.MAX_VALUE){
            if(neg==1){
                return Integer.MAX_VALUE;
            }else{
                return Integer.MIN_VALUE;
            }
        }
        ans*=neg;
        return (int)ans;
    }
}