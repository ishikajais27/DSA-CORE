import java.util.HashMap;
import java.util.Map;

public class Range {
    public static void main(String[] args) {
        int[][] ranges = {{1,2},{3,4},{5,6}};
        int left = 2, right = 5;
        System.out.println(isCovered(ranges, left, right));
    }
    static boolean isCovered(int[][] ranges, int left, int right) {
        Map<Integer, Boolean> map = new HashMap<>();

        for (int i = 0; i < ranges.length; i++) {
            int start = ranges[i][0];
            int end = ranges[i][1];

            for (int num = start; num <= end; num++) {
                map.put(num, true);
            }
        }

        for (int i = left; i <= right; i++) {
            if (!map.containsKey(i)) return false;
        }

        return true;
    }
}
