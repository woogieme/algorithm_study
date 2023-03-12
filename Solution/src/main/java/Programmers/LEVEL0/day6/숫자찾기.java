package Programmers.LEVEL0.day6;

public class 숫자찾기 {
    public int solution(int num, int k) {
        int num2=num;
        int answer = -1;
        int count=0;
        while(num>0){
            num/=10;
            count+=1;
        }
        for (int i = 0; i < count; i++) {
            if((num2%10)==k){
                answer=count-i;
            }
            num2/=10;
        }
        return answer;
    }
}
