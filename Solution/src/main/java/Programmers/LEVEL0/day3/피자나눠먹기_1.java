package Programmers.LEVEL0.day3;

public class 피자나눠먹기_1 {
    public int solution(int n) {
        int answer = 0;
        if (n>=1 && n<=7){
            return 1;
        }
        else{
            while (n>0){
                n-=7;
                answer+=1;
            }
        }

        return answer;
    }
}
