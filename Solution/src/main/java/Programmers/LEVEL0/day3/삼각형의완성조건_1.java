package Programmers.LEVEL0.day3;

import java.util.Arrays;

public class 삼각형의완성조건_1 {
    public int solution(int[] sides) {
        int answer = 0;
        Arrays.sort(sides);
        if ((sides[0]+sides[1]) >sides[2]){
            return 1;
        }
        return 2;
    }
}
