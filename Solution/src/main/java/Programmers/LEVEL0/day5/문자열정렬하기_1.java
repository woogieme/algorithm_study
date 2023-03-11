package Programmers.LEVEL0.day5;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
public class 문자열정렬하기_1 {
    public ArrayList<Integer> solution(String my_string) {
        ArrayList<Integer> answer = new ArrayList<Integer>();
        for(int i=0; i<my_string.length(); i++){
            if(my_string.charAt(i)-'0'>=0 && my_string.charAt(i)-'0'<=9 ){
                answer.add(my_string.charAt(i)-'0');
            }
            Collections.sort(answer);
        }
        return answer;
    }
}
