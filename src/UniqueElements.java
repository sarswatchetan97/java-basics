import java.util.HashMap;
import java.util.Map;

public class UniqueElements {
    public static void main(String[] args) {
        int[] arr = {4, 5, 2, 4,2, 1};

        Map<Integer, Integer> map = new HashMap<>();

        for (int ele : arr) {
            if (map.containsKey(ele)) {
                map.put(ele, map.get(ele) + 1);
            }
            else {
                map.put(ele, 1);
            }
        }

        /*for (int ele : arr) {
            if (map.containsKey(ele)) {
                map.put(ele, map.getOrDefault(ele, 1));
            }
        }*/

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                System.out.println(entry.getKey());
            }
        }
    }
}
