package tuyana.week5;

import java.util.concurrent.ConcurrentHashMap;

public class ReturnMethod {

    public static void main(String[] args) {

        String unique = "AAABBBCCCDEF";
        String[]cvetar = unique.trim().split("");

        ConcurrentHashMap<String,Integer> hm = new ConcurrentHashMap<>();
        for(int i=0; i<cvetar.length; i++){
            if(!hm.containsKey(cvetar[i])){
                hm.put(cvetar[i],1);
            }else{
                hm.put(cvetar[i], hm.get(cvetar[i])+1);
            }
        }
        for(String ele:hm.keySet()){
            if(hm.get(ele)>1){
                hm.remove(ele);
            }
        }
        for(String key:hm.keySet()){
            System.out.println(key);
        }

    }


}


/*
Write a return  method that can find the unique characters from the String
Ex:  unique("AAABBBCCCDEF")  ==>  "DEF";

 */
