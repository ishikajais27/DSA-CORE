

public class Product {
    public static void main(String args[]) {
        int[] nums = {1,2,3,4};
       //using 2 loops
    //    for(int i=0;i<nums.length;i++){
    //     arr[i] =1;
    //       for (int j = 0; j < nums.length; j++){
    //         if(i!=j){
    //               arr[i]*=nums[j];
    //         }
    //     }
    //    }
    
//---------------------------------------------------------------------------------
    //USING 1 LOOP AND RECURSION
//     int pre = 1;
//        int[] suffix = new int[nums.length];
//        prod(nums,suffix,nums.length-1);
//    for (int i = 0; i < nums.length; i++) { 
//             arr[i] = pre * suffix[i]; 
//             pre *= nums[i]; 
//         }
//        for(int num:arr){
//         System.out.println(num);
//        }



//-----------------------------------------------------------------------------------
//ANOTHER APPROACH BEST FROM ALL
//1ST CALCULATE PREFIX AND STORE IN RESULT ARRAY AND THEN CALCUALTE SUFFIX AND RESULT

int[] res = new int[nums.length];
 res[0] =  1;

 for(int i=1;i<nums.length;i++){
  res[i] = res[i-1]*nums[i-1];
 }

 int suf =1;
for(int i=nums.length-1;i>=0;i--){
   res[i] *= suf;
   suf*=nums[i];
   
}
  for(int num:res){
         System.out.println(num);
        }


    }

    //    static void prod(int[] nums, int[] suffix, int i) {
    //     if (i < 0) return;
    //     if (i == nums.length - 1) {
    //         suffix[i] = 1; 
    //     } else {
    //         suffix[i] = suffix[i + 1] * nums[i + 1];
    //     }
    //     prod(nums, suffix, i - 1); 
    // }
}

