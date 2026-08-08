class Solution:
    def checkInclusion(self, s1: str, s2: str) -> bool:
        s1_len = len(s1)
        s2_len = len(s2)

        if s1_len > s2_len :
            return False

        s1Count = [0] * 26
        s2Count = [0] * 26

        for i in range(s1_len):
            s1Count[ord(s1[i]) - ord('a')]+=1
            s2Count[ord(s2[i]) - ord('a')]+=1


        for i in range(s1_len,s2_len):
            if s1Count == s2Count:
                return True
            s2Count[ord(s2[i]) - ord('a')] += 1
            s2Count[ord(s2[i - s1_len]) - ord('a')] -= 1

        return s1Count == s2Count