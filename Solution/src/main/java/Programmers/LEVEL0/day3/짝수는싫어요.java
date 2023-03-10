package Programmers.LEVEL0.day3;

public class 짝수는싫어요 {
    public int[] solution(int n) {
        int src=0;
        if (n%2==0){
            src=n/2;
        }
        else{
            src=(n/2)+1;
        }
        int[] answer = new int[src];
        int tmp=0;
        for(int i=1; i<=n; i++){
            if(i%2!=0){
                answer[tmp] = i;
                tmp+=1;
            }
        }
        return answer;
    }
}
