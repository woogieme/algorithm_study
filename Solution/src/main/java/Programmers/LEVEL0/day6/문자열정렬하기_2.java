package Programmers.LEVEL0.day6;

public class 문자열정렬하기_2 {
    public String solution(String my_string) {

        my_string = my_string.toLowerCase()
                .chars()
                .sorted()
                .collect(StringBuilder::new,
                        StringBuilder::appendCodePoint,
                        StringBuilder::append)
                .toString();
        return my_string;
    }
}
