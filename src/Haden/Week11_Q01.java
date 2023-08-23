package Haden;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Week11_Q01 {

    public static void main(String[] args) {

        /**
         Write a method that prints the frequency of each character from a String
         */

        Scanner scn = new Scanner(System.in);
        System.out.println("Enter a String value");

        String str = scn.nextLine();
        FrequencyTest(str);

    }

    public static void FrequencyTest(String  str ) {
        Map<Character, Integer> map = new LinkedHashMap<>();
        for (Character each : str.toCharArray()) {
            if (map.containsKey(each)) {
                map.put(each, map.get(each) + 1);
            } else {
                map.put(each, 1);
            }
        }
        System.out.println(map);
    }

}
