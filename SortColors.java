import java.util.Arrays;
import java.util.Scanner;

public class SortColors {

    public static void sortColors(int[] arr) {
        int low = 0;              
        int mid = 0;              
        int high = arr.length - 1; 

        while (mid <= high) {
            switch (arr[mid]) {
                case 0:
                    int temp0 = arr[low];
                    arr[low] = arr[mid];
                    arr[mid] = temp0;
                    low++;
                    mid++;
                    break;
                case 1:
                    mid++;
                    break;
                case 2:
                    int temp2 = arr[mid];
                    arr[mid] = arr[high];
                    arr[high] = temp2;
                    high--;
                    break;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter elements (only 0, 1, 2):");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        sortColors(arr);

        System.out.println("Sorted array: " + Arrays.toString(arr));
        sc.close();
    }
}
