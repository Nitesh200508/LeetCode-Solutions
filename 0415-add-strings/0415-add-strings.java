class Solution {
    public String addStrings(String num1, String num2) {
        int i = num1.length() - 1;
        int j = num2.length() - 1;
        int carry = 0;

        StringBuilder sb = new StringBuilder();

        while (i >= 0 || j >= 0 || carry > 0) {

            int n1;
            if (i >= 0) {
                n1 = num1.charAt(i) - '0';
            } else {
                n1 = 0;
            }

            int n2;
            if (j >= 0) {
                n2 = num2.charAt(j) - '0';
            } else {
                n2 = 0;
            }

            int sum = n1 + n2 + carry;

            sb.append(sum % 10);
            carry = sum / 10;

            i--;
            j--;
        }

        return sb.reverse().toString();
    }
}