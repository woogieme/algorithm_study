package Programmers.LEVEL0.day1;

public class 각도기 {
    public int solution(int angle) {
        int answer = 0;

        if (0<angle&& angle<=90){
            if (angle==90){
                answer=2;
                return answer;
            }
            else{
                answer=1;
                return answer;
            }
        }



        if (90<angle && angle<=180){
            if (angle==180){
                answer=4;
                return answer;
            }
            else{
                answer=3;
                return answer;
            }
        }


        return answer;
    }
}
