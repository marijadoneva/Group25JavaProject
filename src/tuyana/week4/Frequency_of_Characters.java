package tuyana.week4;

import java.util.*;

public class Frequency_of_Characters {
    public static void main(String[] args) {

     String str = "AAABBCDD";

        Map<Character, Integer> map = new LinkedHashMap<>();

        for(String each : str.split("")){
            int frequency = Collections.frequency(Arrays.asList(str.split("")), each);
            map.put(each.charAt(0), frequency);
        }
        System.out.println(map);





    }
}


/*
String - Frequency of Characters
Write a return method that can find the frequency of characters
  Ex: FrequencyOfChars("AAABBCDD") ==> A3B2C1D2
 */