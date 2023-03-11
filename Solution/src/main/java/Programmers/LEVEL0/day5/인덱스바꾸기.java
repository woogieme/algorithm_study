package Programmers.LEVEL0.day5;

public class 인덱스바꾸기 {
    public String solution(String my_string, int num1, int num2) {
        String answer = "";
        for(int i= 0; i<my_string.length();i++){
            if (i==num1){
                answer+=String.valueOf(my_string.charAt(num2));
                continue;
            }
            else if(i==num2){
                answer+=String.valueOf(my_string.charAt(num1));
                continue;
            }
            answer+=answer=String.valueOf(my_string.charAt(i));
        }
        return answer;

    }
}
