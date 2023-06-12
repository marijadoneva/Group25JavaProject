import java.util.HashMap;

public class SameLetters {
    public static boolean same(String str1, String str2) {
        if (str1.length()!= str2.length()){
            return  false;
        }
        HashMap<Character, Integer> charCount = new HashMap<>();
        for (int i = 0; i < str1.length(); i++) {
            char c1 = str1.charAt(i);
            char c2 = str2.charAt(i);

            charCount.put(c1, charCount.getOrDefault(c1, 0) + 1);
            charCount.put(c2, charCount.getOrDefault(c2, 0) - 1);
        }

        for (int count : charCount.values()) {
            if (count != 0) {
                return false;
            }
        }

        
        return true;
    }

    public static void main(String[] args) {
        String str1 = "abc";
        String str2 = "cab";
        boolean result = same(str1, str2);
        System.out.println(result);  // Output: true

        str1 = "abc";
        str2 = "abb";
        result = same(str1, str2);
        System.out.println(result);  // Output: false


        }
    }

/*
String - Same letters
Write a return method that checks if a string is built out of the same letters as another string.
  Ex: same("abc", "cab"); ==> true
      same("abc", "abb"); ==> false
 */