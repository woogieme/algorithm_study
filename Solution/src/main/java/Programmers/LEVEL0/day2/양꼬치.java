package Programmers.LEVEL0.day2;

public class 양꼬치 {
    public int solution(int n, int k) {
        int answer = 0;
        int minus=n/10;
        k=k-minus;
        answer=(k*2000)+(n*12000);
        return answer;
    }
}
