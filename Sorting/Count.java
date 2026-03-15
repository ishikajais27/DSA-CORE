import java.util.Arrays;

public class Count {
    public static void main(String[] args) {
        int[] arr = {6,2,114,96,1,0};
         count(arr,6);
         System.out.println(Arrays.toString(arr));
    }
  static void count(int[] arr,int n){
    int max = arr[0];
    for(int a:arr){
        if(a>max){
            max = a;
        }
    }
    int[] countArr = new int[max+1];
    for(int num:arr){
        countArr[num]++;
    }
    int index =0;
    for(int i=0;i<max+1;i++){
        while(countArr[i]>0){
            arr[index]=i;
            index++;
            countArr[i]--;
        }
    }
  }
}
