package Programmers.LEVEL0.day6;

public class 합성수찾기 {
    public int solution(int n) {
        int answer = 0;
        int count=0;
        for (int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                if (i%j==0){
                    count+=1;
                }
            }
            if (count>=3){
                answer+=1;
            }
            count=0;
        }
        return answer;
    }
}
