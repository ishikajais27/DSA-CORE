import java.util.Arrays;

public class Bubble {
    public static void main(String[] args) {
        int[] arr = {2,4,2124,1,0,54};
        System.out.println(Arrays.toString(bub(arr, arr.length)));
    }

    static int[] bub(int[] arr, int n) {
        for (int i = 0; i < n; i++) {
            boolean flag = true;  

            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {   
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    flag = false;
                }
            }

            if (flag) {   
                break;
            }
        }
        return arr;
    }
}