import java.util.*;

public class ReverseWords {
    public static String reverseWords(String s) {
        // Step 1: Trim leading/trailing spaces and split by one or more spaces
        String[] words = s.trim().split("\\s+");
        
        // Step 2: Reverse the array of words
        Collections.reverse(Arrays.asList(words));
        
        // Step 3: Join words with a single space
        return String.join(" ", words);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = sc.nextLine();

        String result = reverseWords(s);
        System.out.println("Reversed: " + result);
    }
}
