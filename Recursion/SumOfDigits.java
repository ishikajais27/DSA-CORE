public class SumOfDigits {
    public static void main(String[] args) {
        int n = 1342;
        System.out.println("Sum of digits - "+SumDigits(n));
    }

    static int SumDigits(int n){
        if(n==0){
            return 0;
        }
       return  (n%10) + SumDigits(n/10);
        
    }
}
