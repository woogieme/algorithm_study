package Programmers.LEVEL0.day4;

class 제곱수판별하기 {
    public int solution(int n) {
        int answer = 0;
        int tmp=1;
        while(answer<=n){
            answer=tmp*tmp;
            if (answer==n){
                return 1;
            }
            tmp+=1;
        }
        return 2;
    }
}