class Solution:
    def longestPalindrome(self, s: str) -> int:
        freq = {}
        for ch in s:
            freq[ch] = freq.get(ch,0) + 1

        length = 0
        odd = False

        for values in freq.values():
            if values % 2 == 0:
                length += values
            else:
                length += values - 1
                odd = True
        
        if odd:
            length += 1

        return length