package Programmers.LEVEL0.day3;

public class 점의위치구하기 {
    public int solution(int[] dot) {
        int answer = 0;
        if (dot[0]<0 && dot[1]<0){
            return 3;
        }
        if (dot[0]>0 && dot[1]>0){
            return 1;
        }
        if (dot[0]<0 && dot[1]>0){
            return 2;
        }
        if (dot[0]>0 && dot[1]<0){
            return 4;
        }
        return answer;
    }
}
