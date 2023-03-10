package Programmers.LEVEL0.day3;

public class 문자반복출력하기 {
    public String solution(String my_string, int n) {
        String answer = "";
        for(int i=0; i<my_string.length(); i++){
            char tmp=my_string.charAt(i);
            for (int j=0; j<n; j++){
                answer+=Character.toString(tmp);
            }
        }
        return answer;
    }
}
