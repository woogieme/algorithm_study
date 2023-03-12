package Programmers.LEVEL0.day6;
import java.util.ArrayList;
public class 배열회전시키기 {
    public ArrayList<Integer> solution(int[] numbers, String direction) {
        ArrayList<Integer> answer = new ArrayList<Integer>();
        if(direction.equals("right")){
            int tmp=numbers[numbers.length-1];
            answer.add(tmp);
            for(int i=0; i<numbers.length-1; i++){
                answer.add(numbers[i]);
            }
        }

        else  if(direction.equals("left")){
            int tmp=numbers[0];
            for(int i=1; i<numbers.length; i++){
                answer.add(numbers[i]);
            }
            answer.add(tmp);
        }
        return answer;
    }
}
