package Programmers.LEVEL0.day5;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 직각삼감형출력하기 {
    public static void main(String[] args)throws IOException  {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int star=Integer.parseInt(br.readLine());
        for(int i=0; i<star;i++){
            for(int j=0; j<=i;j++){
                System.out.print("*");

            }
            System.out.println();
        }

    }
}
