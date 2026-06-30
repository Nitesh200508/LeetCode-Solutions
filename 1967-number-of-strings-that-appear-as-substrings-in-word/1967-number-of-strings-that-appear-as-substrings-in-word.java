class Solution {
    public int numOfStrings(String[] arr, String word) {
        int count = 0;

        for (String s : arr) {
            if (word.contains(s))
                count++;
        }

        return count;
    }
}