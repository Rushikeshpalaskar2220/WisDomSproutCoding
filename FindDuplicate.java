import java.util.Scanner;

public class FindDuplicate {

    public static int findDuplicate(int[] arr) {
        // Phase 1: Detect intersection point in the cycle
        int slow = arr[0];
        int fast = arr[0];

        do {
            slow = arr[slow];          // move one step
            fast = arr[arr[fast]];     // move two steps
        } while (slow != fast);

        // Phase 2: Find the entrance to the cycle (duplicate)
        slow = arr[0];
        while (slow != fast) {
            slow = arr[slow];
            fast = arr[fast];
        }

        return slow; // duplicate number
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array (n+1): ");
        int size = sc.nextInt();

        int[] arr = new int[size];
        System.out.println("Enter " + size + " elements (values in range 1..n):");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        int duplicate = findDuplicate(arr);
        System.out.println("Duplicate number: " + duplicate);

        sc.close();
    }
}
