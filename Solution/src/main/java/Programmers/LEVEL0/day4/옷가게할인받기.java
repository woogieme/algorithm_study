package Programmers.LEVEL0.day4;

public class 옷가게할인받기 {
    public int solution(int price) {
        int answer = 0;
        double tmp=0;
        tmp=(price/10);
        if (price >=500000){
            price-=(tmp*2);
        }
        else if (price >=300000){
            price-=tmp;
        }
        else if (price >=100000){
            price-=(tmp/2);
        }

        return price;
    }
}
