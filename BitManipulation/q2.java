//In an array every no. appears twice and only 1 no. appears 1 time find that no.(TO FIND UNIQUE NO.  WE CAN USE THIS CONCEPT )
import java.util.Scanner;
public class q2{
    public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
           System.out.print("Enter array size: ");
        int n = sc.nextInt();
 
        int[] arr = new int[n];
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Answer - "+ans(arr));
    }
private static int ans(int[] arr){
        int unique =0;
    for(int i:arr){
        unique^=i;
    }
    return unique;
}
}