package Hannah;


    public class Week05_StringReverser {
        public static String reverse(String str) {
            StringBuilder reversed = new StringBuilder(str);
            reversed.reverse();
            return reversed.toString();
        }

        public static void main(String[] args) {
            String input = "ABCD";
            String reversedString = reverse(input);
            System.out.println(reversedString);  // Output: DCBA
        }
    }

/*
Write a return method that can reverse  String
Ex: Reverse("ABCD"); ==> DCBA
 */
