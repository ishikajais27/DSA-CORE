import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the nth term - ");
        n = sc.nextInt();
        int ans = fib(n);
        System.out.println(ans);
    }
    

   static int fib(int n){
    if(n<2){
        return n;
    }
   return fib(n-1)+fib(n-2);
   }

}
