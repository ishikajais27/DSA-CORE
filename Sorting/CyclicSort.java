public class CyclicSort {

    public static void main(String[] args) {
        int[] arr = {3,4,1,5,2};
        cyclic(arr);

        for(int num : arr){
            System.out.print(num + " ");
        }
    }

    static void cyclic(int[] arr){
        int i = 0;

        while(i < arr.length){
            int correct = arr[i] - 1;

            if(arr[i] != arr[correct]){
                swap(arr, i, correct);
            }
            else{
                i++;
            }
        }
    }

    static void swap(int[] arr, int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}