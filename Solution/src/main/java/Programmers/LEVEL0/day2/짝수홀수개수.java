package Programmers.LEVEL0.day2;

public class 짝수홀수개수 {
    public int[] solution(int[] num_list) {
        int[] answer = new int[2];
        int len= num_list.length;

        for(int i=0; i<len; i++){
            if (num_list[i]%2==0){
                answer[0]+=1;
            }
            else{
                answer[1]+=1;
            }
        }
        return answer;
    }
}
