import java.util.*;

public class LeadersInArray {

    public static List<Integer> findLeaders(int[] arr) {
        List<Integer> leaders = new ArrayList<>();
        int n = arr.length;
        int maxFromRight = Integer.MIN_VALUE;

        // Traverse from right to left
        for (int i = n - 1; i >= 0; i--) {
            if (arr[i] > maxFromRight) {
                leaders.add(arr[i]);  // Current element is a leader
                maxFromRight = arr[i];
            }
        }

        // Reverse to maintain original order
        Collections.reverse(leaders);
        return leaders;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        List<Integer> leaders = findLeaders(arr);
        System.out.println("Leaders: " + leaders);

        sc.close();
    }
}
