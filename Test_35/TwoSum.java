import java.util.*;

public class TwoSum {
    public static void main(String[] args) {
        int[] arr = {3, 2, 4, 7};
        int target = 6;
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            int comp = target - arr[i];
            if (map.containsKey(comp)) {
                System.out.println("Indices: " + map.get(comp) + ", " + i);
                return;
            }
            map.put(arr[i], i);
        }
        System.out.println("No pair ");
    }
}
