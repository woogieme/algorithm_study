package Programmers.LEVEL0.day6;

public class 외계행성의나이 {
    public String solution(int age) {
        String answer = "";
        while(age>0){
            char tmp=(char)(age%10+'a');
            answer+=tmp;

            age/=10;

        }
        StringBuffer sb =new StringBuffer(answer);
        String re = sb.reverse().toString();
        return re;
    }
}
