import java.util.Arrays;

public class Prefix {
        public static void main(String[] args) {
            String[] str = {"flower","flow","flowr"};

         //Brutte Force TC = O(n^2)
            // int n = str.length;
            // String op ="";
            // boolean flag = true;
            // for(int i=0;i<n;i++){
            //     for(int j=0;j<n-1;j++){  //here j<n not correct j<smallest string length
            //         if(str[j].charAt(i)!=str[j+1].charAt(i)){ 
            //             flag = false;
            //         }
            //     }
            //     if(flag==true){
            //         op += str[0].charAt(i);
            //     }
            // }
            // System.out.println(op);
            System.out.println( longestCommonPrefix(str) );

            
        }


       static String longestCommonPrefix(String[] strs) {
        
        if (strs == null || strs.length == 0) return "";
        
        Arrays.sort(strs);
        
        String str = "";
        int i = 0;
        
        while (i < strs[0].length() &&
               i < strs[strs.length - 1].length() &&
               strs[0].charAt(i) == strs[strs.length - 1].charAt(i)) {
            
            str += strs[0].charAt(i);
            i++;
        }
        
        return str;
    }
    }
