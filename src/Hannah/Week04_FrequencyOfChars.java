package Hannah ;
import java.util.HashMap;
import java.util.Map;

public class Week04_FrequencyOfChars {
    public static String getFrequencyOfChars(String str) {
        // Create a HashMap to store character frequencies
        Map<Character, Integer> frequencyMap = new HashMap<>();

        // Iterate over each character in the string
        for (char ch : str.toCharArray()) {
            // Increment the count for the character in the frequency map
            frequencyMap.put(ch, frequencyMap.getOrDefault(ch, 0) + 1);
        }

        // Create a StringBuilder to build the result string
        StringBuilder result = new StringBuilder();

        // Iterate over the frequency map and build the result string
        for (Map.Entry<Character, Integer> entry : frequencyMap.entrySet()) {
            result.append(entry.getKey()).append(entry.getValue());
        }

        return result.toString();
    }

    public static void main(String[] args) {
        String input = "AAABBCDD";
        String frequency = getFrequencyOfChars(input);
        System.out.println(frequency);  // Output: A3B2C1D2
    }
}



