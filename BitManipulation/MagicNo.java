//Asked in AMAZON Find the nth magic no.
import  java.util.Scanner;
public class MagicNo {
public static void main(String[] args) {
int n;
Scanner sc = new Scanner(System.in);
  System.out.print("Enter number: ");
n = sc.nextInt();
int base =5;
int ans = 0;
while(n>0){
  int last = n & 1;
  n = n>>1;
  ans+=last*base;
  base = base*5;
}
System.out.println("Magic no. of the given number is - "+ans);

}

}
