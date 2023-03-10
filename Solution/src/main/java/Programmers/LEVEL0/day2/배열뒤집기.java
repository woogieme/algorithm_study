package Programmers.LEVEL0.day2;

public class 배열뒤집기 {
    public int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length];
        int k=0;
        for(int i=num_list.length-1; i>=0; i--){
            answer[k]=num_list[i];
            k+=1;
        }
        return answer;
    }
}
