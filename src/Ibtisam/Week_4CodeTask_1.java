package Ibtisam;

public class Week_4CodeTask_1 {


    public static void main(String[] args) {


            String str = "AAABBCDD";
            String frequency = frequencyOfChars(str);
            System.out.println(frequency);
        }
        public static String frequencyOfChars(String str){

            String res="";

            for (int j = 0; j < str.length(); j++) {
                char ch=str.charAt(j); //frequency of each character from string
                int count=0;

                for (int i = 0; i < str.length(); i++) {//to find the frequency of each character
                    if(str.charAt(i)==ch){
                        count++;
                    }
                }
                if(res.contains(""+ch)){//contains only accepts string so we concat "" to char
                    continue; //skip  the duplicated character, if the character is already included in the result
                }
                res +=ch+""+count;
            }
            return res;
        }
    }





/*
      String - Frequency of Characters
      Write a return method that can find the frequency of characters
        Ex: FrequencyOfChars("AAABBCDD") ==> A3B2C1D2
 */