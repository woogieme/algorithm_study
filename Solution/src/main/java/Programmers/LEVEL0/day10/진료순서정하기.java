package Programmers.LEVEL0.day10;

public class 진료순서정하기 {
    public int[] solution(int[] emergency) {

        int[] answer = new int[emergency.length];
        int count=1;
        for(int i =0; i<answer.length; i++){
            int tmp=0;
            for(int j=0; j<answer.length; j++){
                if(tmp<emergency[j]){
                    tmp=emergency[j];
                }
            }
            for(int x=0; x<answer.length; x++){
                if(tmp==emergency[x]){
                    answer[x]+=count;
                    emergency[x]=-1;
                    count+=1;
                }
            }

        }
        return answer;
    }
}
