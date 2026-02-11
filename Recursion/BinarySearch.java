import java.util.Scanner;

public class BinarySearch {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter size of the sorted array - ");
        int n = scan.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter elements (sorted order): ");
        for(int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }

        System.out.println("Enter target element to search: ");
        int target = scan.nextInt();

        int result = search(arr, target, 0, n - 1);

        if(result == -1)
            System.out.println("Element not found");
        else
            System.out.println("Element found at index: " + result);
    }

    static int search(int arr[], int target, int s, int end) {
        if(s > end) {
            return -1;
        }

        int mid = s + (end - s) / 2;

        if(arr[mid] == target) {
            return mid;
        }
        else if(arr[mid] > target) {
            return search(arr, target, s, mid - 1);
        }
        else {
            return search(arr, target, mid + 1, end);
        }
    }
}
