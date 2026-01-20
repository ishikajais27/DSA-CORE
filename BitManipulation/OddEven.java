import java.util.Scanner;


public class OddEven{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         System.out.print("Enter number: ");
        int n = sc.nextInt();
        if((n&1) == 1){
            System.out.println("Given number is odd");
        }
        else{
            System.out.println("Given number is even");
        }
    }
}