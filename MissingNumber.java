import java.util.Scanner;

public class MissingNumber {

    public static int findMissing(int[] arr, int n) {
        
        long expectedSum = (long) n * (n + 1) / 2;

      
        long actualSum = 0;
        for (int num : arr) {
            actualSum += num;
        }

      
        return (int)(expectedSum - actualSum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter value of n: ");
        int n = sc.nextInt();

        int[] arr = new int[n - 1];
        System.out.println("Enter " + (n - 1) + " elements:");
        for (int i = 0; i < n - 1; i++) {
            arr[i] = sc.nextInt();
        }

        int missing = findMissing(arr, n);
        System.out.println("Missing number: " + missing);

        sc.close();
    }
}
