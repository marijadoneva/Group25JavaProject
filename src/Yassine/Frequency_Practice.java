package Yassine;

import java.util.Arrays;
import java.util.Collections;

public class Frequency_Practice {

    public static void main(String[] args) {

        String str = "AAABBCDD";

        String result = "";

        for (String each : str.split("")) {

            int frequency = Collections.frequency(  Arrays.asList( str.split("") )   , each );

            if(!result.contains(each)){
                result += each + frequency;
            }

        }


        System.out.println(result);
    }
}
