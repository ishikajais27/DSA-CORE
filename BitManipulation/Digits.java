//How to find the digits of a number 'n' of base 'b'.
//Formula = no.of digits = int(log n base b) + 1

public class Digits {
    public static void main(String[] args) {
        int n = 45657786;
        int base = 10;  //decimal
        int ans = (int)(Math.log(n) /  Math.log(base)) + 1;
        System.out.println(ans);
    }
}
