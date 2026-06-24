class Solution:
    def plusOne(self, digits: List[int]) -> List[int]:
        n = len(digits)
        num = 0
        for i in digits:
            num = num * 10 + i
        num+=1
        ans=[]
        while(num!=0):
            rem=num%10
            ans.append(rem)
            num//=10
        return ans[::-1]
        
