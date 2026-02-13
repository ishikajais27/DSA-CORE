public class LinearSearch {
    public static void main(String args[]){
  int[] arr = {1,2,3,4,5};
  int target  = 4;
  System.out.println(ls(arr, target, 0));

    }

    static int ls(int arr[],int target,int i){
        if(i>=arr.length-1) return -1;
      if(target == arr[i]) return  i+1;
      return ls(arr, target, i+1);
    }
}
