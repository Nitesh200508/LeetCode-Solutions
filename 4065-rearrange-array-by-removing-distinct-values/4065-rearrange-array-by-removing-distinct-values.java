class Solution {
    public int[] rearrangeArray(int[] nums) {
        Arrays.sort(nums);

        int n = nums.length;
        int[] values = new int[n];
        int[] count = new int[n];
        int size=0;
        for(int i=0;i<n;i++){
        if(size == 0 || values[size-1]!= nums[i]){
            values[size] = nums[i];
            count[size]=1;
            size++;
        }
        else{
            count[size-1]++;
            }
        }

        int[] ans = new int[n];
        int index=0;
        while(index<n){
            for(int i=0;i<size;i++){
                if(count[i]>0){
                    ans[index]=values[i];
                    index++;

                    count[i]--;
                }
            }
        }
        return ans;
    }
}