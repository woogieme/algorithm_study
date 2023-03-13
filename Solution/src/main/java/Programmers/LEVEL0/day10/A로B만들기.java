package Programmers.LEVEL0.day10;

import java.util.Arrays;

public class A로B만들기 {
    public int solution(String before, String after) {
        int answer = 0;
        char[] a=before.toCharArray();
        char[] b=after.toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);
        String x=new String(a);
        String y=new String(b);
        if (x.equals(y)){
            return 1;
        }
        else{
            return 0;
        }
    }
}
