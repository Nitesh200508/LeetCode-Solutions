class Solution {
    public int getLucky(String s, int k) {
        StringBuilder sb=new StringBuilder();
        for(char c:s.toCharArray()){
            sb.append(c-'a'+1);
        }
        int ans=0;
        for(char a:sb.toString().toCharArray()){
            ans+=a-'0';
        }
        k--;
        while(k>0){
            int sum=0;
            while(ans>0){
                int rem=ans%10;
                sum+=rem;
                ans/=10;
            }
            ans=sum;
            k--;
        }
        return ans;
    }
}