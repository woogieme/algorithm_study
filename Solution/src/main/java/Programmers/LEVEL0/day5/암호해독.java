package Programmers.LEVEL0.day5;

public class 암호해독 {
    public String solution(String cipher, int code) {
        int tmp=code-1;
        String answer = "";
        for(int i =0 ; i<cipher.length();i++)
        {
            if(i==(tmp)){
                answer+=String.valueOf(cipher.charAt(i));
                tmp+=code;
            }
        }
        return answer;
    }
}
