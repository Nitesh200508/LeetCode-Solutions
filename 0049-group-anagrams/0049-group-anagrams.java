class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        int n=strs.length;
        List<List<String>> ans=new ArrayList<>();
        for(int i=0;i<n;i++){
            if(strs[i]!="-1"){
                List<String> temp=new ArrayList<>();
                temp.add(strs[i]);
                char[] a=strs[i].toCharArray();
                Arrays.sort(a);
                for(int j=i+1;j<n;j++){
                    if(strs[i].length()!=strs[j].length())continue;
                    char[] b=strs[j].toCharArray();
                    Arrays.sort(b);
                    int flag=0;
                    for(int k=0;k<strs[j].length();k++){
                        if(a[k]!=b[k]){
                            flag=1;
                            break;
                        }
                    }
                    if(flag==0){
                        temp.add(strs[j]);
                        strs[j]="-1";
                    }
                }
                ans.add(temp);
            }
        }
        return ans;
    }
}