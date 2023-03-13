package Programmers.LEVEL0.day10;

import java.util.Arrays;

public class 가까운수 {
    public int solution(int[] array, int n) {
        Arrays.sort(array);
        int [] array_abs=new int[array.length];
        for (int i=0; i< array.length; i++){
            array_abs[i]=Math.abs(n-array[i]);
        }
        int tmp=0;
        int k=0;
        for(int i=0; i<array.length; i++){
            if(i==1){
                tmp=array_abs[i];
                k=i;
                continue;
            }

            if (tmp>array_abs[i]){
                tmp=array_abs[i];
                k=i;
            }

        }
        return array[k];
    }
}
