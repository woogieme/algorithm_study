package Programmers.LEVEL0.day6;

public class 게임_369 {
    public int solution(int order) {
        int answer = 0;

        while(order>0){
            int tmp=order%10;
            if(tmp==3 || tmp==6 || tmp==9 ){
                answer+=1;
            }
            order/=10;
        }
        return answer;
    }
}
