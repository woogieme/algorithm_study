package Programmers.LEVEL0.day10;

import java.util.HashMap;

public class 모스부호_1 {
    public String solution(String letter) {
        HashMap<String,String> morse = new HashMap<String,String>();
        morse.put(".-","a");
        morse.put("-...","b");
        morse.put("-.-.","c");
        morse.put("-..","d");
        morse.put(".","e");
        morse.put("..-.","f");
        morse.put("--.","g");
        morse.put("....","h");
        morse.put("..","i");
        morse.put(".---","j");
        morse.put("-.-","k");
        morse.put(".-..","l");
        morse.put("--","m");
        morse.put("-.","n");
        morse.put("---","o");
        morse.put(".--.","p");
        morse.put("--.-","q");
        morse.put(".-.","r");
        morse.put("...","s");
        morse.put("-","t");
        morse.put("..-","u");
        morse.put("...-","v");
        morse.put(".--","w");
        morse.put("-..-","x");
        morse.put("-.--","y");
        morse.put("--..","z");

        String[] arr =letter.split(" ");
        String answer="";
        for (int i = 0; i < arr.length; i++) {
            for(String key : morse.keySet()){
                if (arr[i].equals(key)){
                    answer+=morse.get(key);
                }
            }
        }
        return answer;
    }
}
