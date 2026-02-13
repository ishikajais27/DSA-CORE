public class Sorted {

    public static void main(String args[]) {

        int[] arr = {1, 2, 3, 4, 5,0};
        System.out.println(Sorted(arr, 0));
    }

    static boolean Sorted(int[] arr, int index) {

       
        if (index == arr.length - 1) {  //base condition
            return true;
        }

        if (arr[index] > arr[index + 1]) {
            return false;
        }

        return Sorted(arr, index + 1);
    }
}