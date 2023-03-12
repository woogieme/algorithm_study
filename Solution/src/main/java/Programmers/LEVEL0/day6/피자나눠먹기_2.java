package Programmers.LEVEL0.day6;

public class 피자나눠먹기_2 {
    public int solution(int n) {
        int answer=0;
        int tmp=6;
        while(true){
            if (tmp%n==0){
                answer=tmp/6;
                break;
            }
            else{
                tmp+=6;
            }
        }
        return answer;
    }
}
