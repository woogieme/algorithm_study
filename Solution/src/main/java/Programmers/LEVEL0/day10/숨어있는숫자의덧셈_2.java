package Programmers.LEVEL0.day10;

public class 숨어있는숫자의덧셈_2 {
    public int solution(String my_string) {
        int answer = 0;
        int i=0;
        int value=0;
        while (i<my_string.length()){
            String tmp="";
            if (my_string.charAt(i)-'0'>=0 &&my_string.charAt(i)-'0'<=9){
                for(int j=i; j<my_string.length(); j++) {
                    if (my_string.charAt(j) - '0' >= 0 && my_string.charAt(j) - '0' <= 9) {
                        tmp += my_string.charAt(j);
                        value += 1;
                    } else {
                        break;
                    }
                }
                answer+=Integer.parseInt(tmp);

            }
            if(value>0){
                i+=value;
                value=0;
            }
            else{
                i+=1;
            }

        }
        return answer;
    }
}
