package Programmers.LEVEL0.day10;

public class k의개수 {
    public int solution(int i, int j, int k) {
        int answer=0;
        for(int x=i; x<=j; x++){
            int y=x;

            while(y>0){
                int tmp=y%10;
                if(tmp==k){
                    answer+=1;
                }
                y/=10;
            }
        }
        return answer;
    }
}
