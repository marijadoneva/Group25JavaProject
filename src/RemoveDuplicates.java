public class RemoveDuplicates {
    public static String RemoveDuplicates(String str) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            if (result.indexOf(String.valueOf(currentChar)) == -1) {
                result.append(currentChar);
            }
        }
        return result.toString();
    }


    public static void main(String[] args) {
        String input = "AAABBBCCC";
        String output = RemoveDuplicates(input);
        System.out.println(output);

    }
}
/*
String - Remove Duplicates
Write a return method that can remove the duplicated values from the String
  Ex: removeDup("AAABBBCCC") ==> ABC
 */