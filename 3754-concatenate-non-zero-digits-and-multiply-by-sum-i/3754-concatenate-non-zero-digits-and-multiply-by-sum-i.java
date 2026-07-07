class Solution {
    public long sumAndMultiply(int n) {
        String str = "";
        long sum=0;
        long no=0;
        while(n>0){
            long rem = n%10;
            if(rem!=0){
                no=no*10+rem;
                sum+=rem;
            }
            n/=10;
        }
        StringBuilder sb=new StringBuilder();
        sb.append(no);
        sb.reverse();
        str=sb.toString();
        no=Integer.parseInt(str);
        long ans=no*sum;
        return ans;
    }
}