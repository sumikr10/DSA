package Practice.Leetcode;

import java.util.Arrays;

public class PlusOne {
    public static void main(String[] args) {
        PlusOne obj = new PlusOne();
        int[] input = {4};
        System.out.println(Arrays.toString(obj.plusOne(input)));
    }
    public int[] plusOne(int[] digits) {
        int carry = 1;
        int n = digits.length;
        for(int i = n - 1; i >= 0; i--){
            int newDigit = digits[i] + carry;
            if(newDigit >= 10){
                carry = 1;
                digits[i] = 0;
            }
            else{
                digits[i] = newDigit;
                return digits;
            }
        }
        //If the input is of only one digit
        int[] result = new int[n + 1];
        result[0] = 1;
        result[1] = digits[0];
        return result;
    }
}
