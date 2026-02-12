public class Palindrome {

    public static void main(String[] args) {
        int n = 2329232;
        System.out.println(palin(n));
    }



    static int sum = 0;

    static int rev(int n) {
        if (n == 0) {          
            return sum;
        }

        int rem = n % 10;
        sum = sum * 10 + rem;
        return rev(n / 10);
    }

    static boolean palin(int n) {
        sum = 0;             
        return n == rev(n);
    }
}

 

