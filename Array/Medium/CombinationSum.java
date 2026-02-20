import java.util.ArrayList;
import java.util.List;

public class CombinationSum {
public static void main(String[] args) {
    int[] arr = {2,3,5};
    int target = 8;
     List<List<Integer>> ans = new ArrayList<>();
        sum(arr, 0, target, new ArrayList<>(), ans);
       System.out.println(ans);
}
  
    static void sum(int[] arr, int i, int t, List<Integer> list, List<List<Integer>> ans) {
        if (t == 0) {
            ans.add(new ArrayList<>(list));
            return;
        }
        if (i == arr.length || t < 0) return;

        list.add(arr[i]);
        sum(arr, i, t - arr[i], list, ans);
        list.remove(list.size() - 1);
        sum(arr, i + 1, t, list, ans);
    }
}
