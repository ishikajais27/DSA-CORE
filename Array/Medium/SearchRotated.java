
public class SearchRotated {
    public static void main(String[] args) {
        int[] arr = {4,5,6,7,0,1,2};
        int n = arr.length - 1;
        int target = 2;


        // while(arr[0] > arr[n]){
        //     rotateRight(arr, n);
        // }

        // for(int i = 0; i <= n; i++){
        //     System.out.println(arr[i]);
        // }

        //OPTIMAL SOLUTION AS WE DO USING 2 POINTERS
        int l =0;
        int e =n-1;
        while(l<=e){
            int mid = (l+e)/2;
            if(arr[mid]>=arr[l]){
                // The line `if(targetarr[l] || target<arr[mid]){` in the code snippet you provided
                // seems to be incomplete or incorrect. It appears to be missing a comparison or
                // logical operation between `target` and `arr[l]`.
                if(target>arr[l] || target<arr[mid]){

                }
            }
        }
    }

    // static int temp;


    // static void rotateRight(int[] arr, int n){
    //     if(n == arr.length - 1){
    //         temp = arr[n]; 
    //     }

    //     if(n > 0){
    //         arr[n] = arr[n - 1]; 
    //         rotateRight(arr, n - 1);
    //     } else {
    //         arr[0] = temp; 
    //     }
    // }
}
