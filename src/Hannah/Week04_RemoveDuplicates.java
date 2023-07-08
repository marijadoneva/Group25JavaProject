package Hannah;


import java.util.LinkedHashSet;

    public class Week04_RemoveDuplicates {
        public static String removeDup(String str) {
            // Use a LinkedHashSet to preserve the order of characters while removing duplicates
            LinkedHashSet<Character> uniqueChars = new LinkedHashSet<>();

            // Iterate over each character in the string and add it to the LinkedHashSet
            for (char ch : str.toCharArray()) {
                uniqueChars.add(ch);
            }

            // Build the resulting string from the unique characters
            StringBuilder result = new StringBuilder();
            for (char ch : uniqueChars) {
                result.append(ch);
            }

            return result.toString();
        }

        public static void main(String[] args) {
            String input = "AAABBBCCC";
            String result = removeDup(input);
            System.out.println(result);  // Output: ABC
        }
    }


