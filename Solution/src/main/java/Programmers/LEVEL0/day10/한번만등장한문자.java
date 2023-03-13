package Programmers.LEVEL0.day10;

public class 한번만등장한문자 {
    public String solution(String s) {
        String answer = "";
        char[] arrCh=s.toCharArray();
        int[] tmp=new int[26];
        for(int i= 0; i<arrCh.length; i++){
            tmp[arrCh[i]-'a']+=1;
        }
        char a;
        for(int i=0; i<tmp.length; i++){
            if (tmp[i]==1){
                a=(char)(i+'a');
                answer+=a;
            }
        }
        return answer;
    }
}
