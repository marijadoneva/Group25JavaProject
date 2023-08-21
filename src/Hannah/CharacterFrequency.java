package Hannah;

import java.util.HashMap;
import java.util.Map;

public class CharacterFrequency {


        public static void printCharacterFrequency(String inputString) {
            Map<Character, Integer> charFrequency = new HashMap<>();

            for (char c : inputString.toCharArray()) {
                charFrequency.put(c, charFrequency.getOrDefault(c, 0) + 1);
            }

            for (Map.Entry<Character, Integer> entry : charFrequency.entrySet()) {
                System.out.println("Character '" + entry.getKey() + "' appears " + entry.getValue() + " times.");
            }
        }

        public static void main(String[] args) {
            String inputString = "Hello, World!";
            printCharacterFrequency(inputString);
        }
    }


