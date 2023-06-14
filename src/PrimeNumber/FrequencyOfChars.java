package PrimeNumber;

import java.util.HashMap;
import java.util.Map;

public class FrequencyOfChars {
    public static String FrequencyOfChars  (String string) {
        Map<Character, Integer> frequency = new HashMap<>();
        for(char c : string.toCharArray()){
            frequency.put(c,frequency.getOrDefault(c,  0)+ 1);
        }
        StringBuilder result =new StringBuilder();
        for (Map.Entry<Character, Integer> entry : frequency.entrySet()){
            result.append(entry.getKey()). append(entry.getValue());
        }
        return  result.toString();
    }
    public static void main(String[] args){
        String inputString = "AAABBCDD";
        String output = FrequencyOfChars(inputString);
        System.out.println(output);//output: A3B2CID2
    }
}

/*
String - Frequency of Characters
Write a return method that can find the frequency of characters
  Ex: FrequencyOfChars("AAABBCDD") ==> A3B2C1D2
 */