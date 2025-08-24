import java.util.*;

public class GroupAnagrams {
    public static List<List<String>> groupAnagrams(String[] strs) {
        // Map to group anagrams, key = sorted string
        Map<String, List<String>> map = new HashMap<>();
        
        for (String str : strs) {
            // Convert word into char array, sort, then convert back
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            String key = new String(chars);

            // Add word to the corresponding anagram group
            map.computeIfAbsent(key, k -> new ArrayList<>()).add(str);
        }
        
        // Return all grouped anagrams as a list of lists
        return new ArrayList<>(map.values());
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input array size
        System.out.print("Enter number of strings: ");
        int n = sc.nextInt();
        sc.nextLine(); // consume newline

        // Input strings
        String[] strs = new String[n];
        System.out.println("Enter the strings:");
        for (int i = 0; i < n; i++) {
            strs[i] = sc.nextLine();
        }

        // Get grouped anagrams
        List<List<String>> result = groupAnagrams(strs);

        // Print result
        System.out.println("Grouped Anagrams:");
        for (List<String> group : result) {
            System.out.println(group);
        }
    }
}
