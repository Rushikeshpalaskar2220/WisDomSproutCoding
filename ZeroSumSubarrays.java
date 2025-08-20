import java.util.*;

public class ZeroSumSubarrays {

    public static List<int[]> findZeroSumSubarrays(int[] arr) {
        List<int[]> result = new ArrayList<>();
        Map<Long, List<Integer>> map = new HashMap<>();

        long prefixSum = 0;

        for (int i = 0; i < arr.length; i++) {
            prefixSum += arr[i];

            // Case 1: subarray from 0..i has sum 0
            if (prefixSum == 0) {
                result.add(new int[]{0, i});
            }

            // Case 2: prefixSum seen before → subarrays exist
            if (map.containsKey(prefixSum)) {
                for (int startIndex : map.get(prefixSum)) {
                    result.add(new int[]{startIndex + 1, i});
                }
            }

            // Store this prefixSum index
            map.computeIfAbsent(prefixSum, k -> new ArrayList<>()).add(i);
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, -3, 3, -1, 2};

        List<int[]> subarrays = findZeroSumSubarrays(arr);

        if (subarrays.isEmpty()) {
            System.out.println("[]");
        } else {
            for (int[] pair : subarrays) {
                System.out.print("(" + pair[0] + ", " + pair[1] + ") ");
            }
        }
    }
}
