class Solution {
    public int[] plusOne(int[] digits) {
        int n = digits.length;
       
        for (int i = n - 1; i >= 0; i--) {
            digits[i] += 1; 
            if (digits[i] == 10) {
                digits[i] = 0;
            } else {
                return digits; 
            }
        }
        
        int[] newNumber = new int[n + 1];
        newNumber[0] = 1; 
        return newNumber;
    }
}
