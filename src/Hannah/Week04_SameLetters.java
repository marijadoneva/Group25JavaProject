package Hannah;

import java.util.HashMap;
import java.util.Map;

public class Week04_SameLetters {
    public static boolean isSame(String str1, String str2) {
        // Create frequency maps for both strings
        Map<Character, Integer> frequencyMap1 = buildFrequencyMap(str1);
        Map<Character, Integer> frequencyMap2 = buildFrequencyMap(str2);

        // Compare the frequency maps
        return frequencyMap1.equals(frequencyMap2);
    }

    private static Map<Character, Integer> buildFrequencyMap(String str) {
        // Create a frequency map for the given string
        Map<Character, Integer> frequencyMap = new HashMap<>();

        // Iterate over each character in the string
        for (char ch : str.toCharArray()) {
            // Increment the count for the character in the frequency map
            frequencyMap.put(ch, frequencyMap.getOrDefault(ch, 0) + 1);
        }

        return frequencyMap;
    }

    public static void main(String[] args) {
        String str1 = "abc";
        String str2 = "cab";
        System.out.println(isSame(str1, str2));  // Output: true

        str1 = "abc";
        str2 = "abb";
        System.out.println(isSame(str1, str2));  // Output: false
    }
}



