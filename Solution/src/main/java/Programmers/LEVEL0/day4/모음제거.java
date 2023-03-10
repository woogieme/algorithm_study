package Programmers.LEVEL0.day4;

public class 모음제거 {
    public String solution(String my_string) {
        char[] array=my_string.toCharArray();
        String answer = "";
        for (int i=0; i<my_string.length(); i++){
            if (array[i]==('a') ||array[i]==('e') ||array[i]==('u')|| array[i]==('o')||array[i]==('i')){
                continue;
            }
            answer+=String.valueOf(array[i]);

        }
        return answer;
    }
}

