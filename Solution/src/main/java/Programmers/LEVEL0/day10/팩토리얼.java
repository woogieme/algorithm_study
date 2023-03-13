package Programmers.LEVEL0.day10;

public class 팩토리얼 {
    public int solution(int n) {
        int answer = 1;
        int tmp=1;
        while(answer<n){
            answer+=(answer*tmp);
            if (answer>n){
                break;
            }
            tmp+=1;
        }
        return tmp;
    }
}
