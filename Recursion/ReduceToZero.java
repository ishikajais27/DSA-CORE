//Question is to count the number of steps to make the number zero;

public class ReduceToZero {

    public static void main(String[] args) {
        int n = 14;
        System.out.println(count(n));
    }

    // static int count(int n, int c) {

    //     if (n == 0) {
    //         return c;
    //     }

    //     if (n % 2 == 0) {
    //         return count(n / 2, c + 1);
    //     } else {
    //         return count(n - 1, c + 1);
    //     }
    // }


    //USING HELPER FUNCTION - 
    static int count(int n){
        return helper(n,0);
    }
    static int helper(int n , int c){
          if (n == 0) {
             return c;
         }

       if (n % 2 == 0) {
             return helper(n / 2, c + 1);
         } else {
             return helper(n - 1, c + 1);
     }
    }
}