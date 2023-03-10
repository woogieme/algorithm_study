package Programmers.LEVEL0.day4;

public class 숨어있는숫자의덧셈_1 {
    public int solution(String my_string) {
        int answer = 0;
        for (int i=0; i<my_string.length();i++){
            int tmp=(my_string.charAt(i)-'0');
            if (tmp>=1 && tmp<=9){
                answer+=tmp;
            }

        }
        return answer;
    }
}
