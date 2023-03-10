package Programmers.LEVEL0.day4;

public class 개미군단 {
    public int solution(int hp) {
        int answer = 0;
        int [] arr = {5,3,1};
        for (int value : arr){
            answer+=hp/value;
            hp=hp%value;

        }
        return answer;
    }
}
