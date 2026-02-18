

import java.util.ArrayList;
import java.util.List;


public class Pascal{
    public static void main(String[] args) {
        int r =4;
        System.out.println(getRow(r));

    }
       static List<Integer> getRow(int rowIndex) {

    //1.USING THIS value = value * (n - i) / (i + 1); FORMULA
    //    List<Integer> row = new ArrayList<>();
    // long value = 1;
    // int n = rowIndex;

    // for (int i = 0; i <= n; i++) {
    //     row.add((int)value);
    //     value = value * (n - i) / (i + 1);
    // }

    // return row;

    //2. Using nested loop
    List<List<Integer>> result = new ArrayList<>();
    for(int i=-0;i<=rowIndex;i++){
        List<Integer> row = new ArrayList<>();
       long value =1;
        for(int j=0;j<=i;j++){
            row.add((int)value);
             value = value * (i - j) / (j + 1); 
        }
        result.add(row);
    }

    return result.get(rowIndex);
    }
}