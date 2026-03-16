import java.util.Arrays;
public class Merge {

   public static void main(String[] args){
    int[] arr  = {2,121,5,0,554,23,2,1,56,3};

    System.out.println(Arrays.toString(MS(arr)));
   }







    static int[] MS(int[] arr){
        if(arr.length == 1){
            return arr;
        }
        int mid = arr.length/2;
        int[] l = MS(Arrays.copyOfRange(arr, 0, mid));
        int[] r = MS(Arrays.copyOfRange(arr, mid, arr.length));
        return merge(l,r);
    }
    static int[] merge(int[] l,int[] r){
        int[] mix = new int[l.length+r.length];
        int i=0,j=0,k=0;
         while(i<l.length && j<r.length){
            if(l[i]<r[j]){
              mix[k] = l[i];
              i++;
            }
            else{
               mix[k] = r[j];
              j++;  
            }
            k++;
         }


         while(i<l.length){
            mix[k] = l[i];
            i++;
            k++;
         }
         while(j<r.length){
            mix[k] = r[j];
            j++;
            k++;
         }
         return mix;
    }
}
