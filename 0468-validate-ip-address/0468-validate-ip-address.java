import java.util.StringTokenizer;
class Solution {
    public String validIPAddress(String queryIP) {
        String[] parts = queryIP.split("[.:]", -1);
        String ans= "Neither";
        if(parts.length==4){
            StringTokenizer st=new StringTokenizer(queryIP,".");
            if(st.countTokens()!=4)return ans;
            if(queryIP.charAt(0)=='.'|| queryIP.charAt(queryIP.length()-1)=='.')return ans;
            for(String s:parts){
                if(s.length()==0 || s.length()>3)return ans;
                if(s.charAt(0)=='0' && s.length()>1)return ans;
                for(char c:s.toCharArray()){
                    if(c>='a' && c<='z')return ans;
                    if(c>='A' && c<='Z')return ans;
                    if(c==':')return ans;
                }
                int temp=Integer.parseInt(s);
                if(temp>=0 && temp<=255)continue;
                else return  ans;
            }
            ans="IPv4";
            return ans;
        }else if(parts.length==8){
            StringTokenizer st=new StringTokenizer(queryIP,":");
            if(st.countTokens()!=8)return ans;
            if(queryIP.charAt(0)==':'|| queryIP.charAt(queryIP.length()-1)==':')return ans;
            for(String s:parts){
                if(s.length()==0 ||s.length()>4)return ans;
                for(char c:s.toCharArray()){
                    if(!((c>='0' && c<='9') || (c>='a' && c<='f') || (c>='A' && c<='F'))){
                        return ans;
                    }
                }                
            }
            ans="IPv6";
            return ans;
        }
        return ans;
    }
}