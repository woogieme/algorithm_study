package Programmers.LEVEL0.day3;

public class 최댓값만들기_1 {
    public int solution(int[] numbers) {
        int answer = 0;
        int tmp=0;
        for(int i=0; i<numbers.length; i++){
            for (int j=0; j<numbers.length; j++){
                if (i==j){
                    continue;
                }
                tmp=numbers[i]*numbers[j];
                if (answer<tmp){
                    answer=tmp;
                }
            }
        }
        return answer;
    }
}
