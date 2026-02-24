import java.util.HashSet;

public class Happy {
    public static void main(String[] args) {
        int n=19;
        System.out.println(isHappy(n));
    }
  static boolean isHappy(int n) {
        int sum = 0;
        HashSet<Integer> set = new HashSet<>();

        if (n <= 0) return false;

        while (n != 1) {
            if (set.contains(n)) return false;
            set.add(n);

            for (int i = n; i > 0; i /= 10) {
                int rem = i % 10;      
                sum += rem * rem;     
            }

            n = sum;
            sum = 0; 
        }

        return true;
    }    
}
