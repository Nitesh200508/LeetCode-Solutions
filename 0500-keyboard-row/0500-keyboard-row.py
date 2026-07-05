class Solution:
    def findWords(self, words: List[str]) -> List[str]:
        fr = "qwertyuiop"
        sr = "asdfghjkl"
        tr = "zxcvbnm"
        ans = []
        for word1 in words:
            fcount = 0
            scount = 0
            tcount = 0
            word = word1.lower()
            for ch in word:
                if ch in fr:
                    fcount += 1
                    
                elif ch in sr:
                    
                    scount += 1
                    
                elif ch in tr:
                   
                    tcount += 1

            if len(word) == fcount or len(word) == scount or len(word) == tcount:
                ans.append(word1)
        return ans
