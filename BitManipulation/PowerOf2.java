import java.util.Scanner;

public class PowerOf2 {
 public static void main(String[] args) {
        int n;
    Scanner s = new Scanner(System.in);
    System.out.println("Enter no. - ");
    n = s.nextInt();

    //1st Method
    // if(((n)&(n-1))==0){
    //     System.out.println("Power of 2");
    // }
    // else{
    //     System.out.println("Not Power of 2");
    // }

 //2nd Method
int count = 0;
int temp = n;

while (temp > 0) {
    if ((temp & 1) == 1) {
        count++;
    }
    temp = temp >> 1;
}

if (count == 1) {
    System.out.println("Power of 2");
} else {
    System.out.println("Not Power of 2");
}

 }

}
