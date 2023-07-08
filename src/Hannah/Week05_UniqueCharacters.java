package Hannah;
import java.util.LinkedHashSet;

public class Week05_UniqueCharacters {
    public static String findUnique(String str) {
        // Use a LinkedHashSet to preserve the order of unique characters
        LinkedHashSet<Character> uniqueChars = new LinkedHashSet<>();

        // Use a frequency array to track the occurrence of each character
        int[] frequency = new int[26];

        // Iterate over each character in the string
        for (char ch : str.toCharArray()) {
            // Increment the frequency count for the character
            frequency[ch - 'A']++;
        }

        // Iterate over each character in the string again
        for (char ch : str.toCharArray()) {
            // If the frequency count of the character is 1, it is unique
            if (frequency[ch - 'A'] == 1) {
                uniqueChars.add(ch);
            }
        }

        // Build the resulting string from the unique characters
        StringBuilder result = new StringBuilder();
        for (char ch : uniqueChars) {
            result.append(ch);
        }

        return result.toString();
    }

    public static void main(String[] args) {
        String input = "AAABBBCCCDEF";
        String result = findUnique(input);
        System.out.println(result);  // Output: DEF
    }
}


