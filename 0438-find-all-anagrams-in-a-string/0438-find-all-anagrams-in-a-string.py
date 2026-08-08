class Solution:
    def findAnagrams(self, s: str, p: str) -> List[int]:
        res = []
        lenS = len(s)
        lenP = len(p)

        if lenP > lenS:
            return res

        pCount = [0] * 26
        sCount = [0] * 26

        for ch in p:
            pCount[ord(ch)-ord('a')] += 1
        for ch in s[:lenP]:
            sCount[ord(ch)-ord('a')] += 1
        if pCount == sCount:
            res.append(0)
        
        for i in range(lenP,lenS):
            oldChar = s[i - lenP]
            sCount[ord(oldChar) - ord('a')] -= 1

            newChar = s[i]
            sCount[ord(newChar) - ord('a')] += 1

            if sCount == pCount:
                res.append(i - lenP + 1)

        return res

        