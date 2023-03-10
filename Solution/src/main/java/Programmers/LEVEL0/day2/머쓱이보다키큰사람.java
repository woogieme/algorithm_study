package Programmers.LEVEL0.day2;

public class 머쓱이보다키큰사람 {
    public int solution(int[] array, int height) {
        int answer = 0;
        for(int i=0; i<array.length; i++){
            if (height<array[i]){
                answer+=1;
            }
        }
        return answer;
    }
}
