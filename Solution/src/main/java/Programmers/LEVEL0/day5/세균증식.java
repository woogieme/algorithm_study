package Programmers.LEVEL0.day5;

public class 세균증식 {
    public int solution(int n, int t) {
        for(int i=0; i<t;i++){
            n*=2;
        }
        return n;
    }
}
