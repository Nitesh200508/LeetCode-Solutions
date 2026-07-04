class Solution:
    def countConsistentStrings(self, allowed: str, words: List[str]) -> int:
        arr = [False]*26
        for ch in allowed:
            arr[ord(ch) - ord('a')] = True
        
        count = 0
        for word in words:
            valid = True
            for ch in word:
                if not arr[ord(ch) - ord('a')]:
                    valid = False
                    break
            if valid:
                count+=1
        return count

