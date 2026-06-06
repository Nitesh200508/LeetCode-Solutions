class Solution:
    def bagOfTokensScore(self, tokens: List[int], power: int) -> int:
        tokens.sort()
        mcs = 0
        cs = 0
        i = 0
        j = len(tokens)-1

        while i <= j:
            if tokens[i] <= power:
                power -= tokens[i]
                cs+=1
                mcs = max(mcs,cs)
                
                i+=1
            elif cs > 0:
                power += tokens[j]
                cs-=1
                j-=1
            else:
                break


        return mcs

