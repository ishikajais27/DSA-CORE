
public class Triangle1 {
    public static void main(String[] args) {
        
    }


  static void pattern(int rows, int col) {

    if (rows == 0) return;

    if (col < rows) {
        pattern(rows, col + 1);
        System.out.print("* ");
    } else {
        pattern(rows - 1, 0);
        System.out.println();
    }
}
}
