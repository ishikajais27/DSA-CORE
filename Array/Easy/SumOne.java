import java.util.Arrays;

public class SumOne {
    public static void main(String[] args) {
        int[] arr = {1,9,9,9,8,9,9,9};
        int[] result = plusOne(arr);
         System.out.println(Arrays.toString(result));
    }
    static int[] plusOne(int[] digits) {

        for (int i = digits.length - 1; i >= 0; i--) {

            if (digits[i] < 9) {
                digits[i]++;
                return digits;  
            }

            digits[i] = 0; 
        }

        int[] result = new int[digits.length + 1];
        result[0] = 1; 
        return result;
    }
}
