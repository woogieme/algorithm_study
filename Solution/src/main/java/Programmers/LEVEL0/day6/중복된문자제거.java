package Programmers.LEVEL0.day6;
import java.util.ArrayList;
public class 중복된문자제거 {
    public String solution(String my_string) {
        char[] arr=my_string.toCharArray();
        ArrayList<String> arrayList = new ArrayList<String>();
        String answer="";
        for(int i=0; i<arr.length; i++){
            if(arrayList.contains(String.valueOf(arr[i]))){
                continue;
            }
            else{
                arrayList.add(String.valueOf(arr[i]));
            }
        }
        for (int i = 0; i < arrayList.size(); i++) {
            answer+=arrayList.get(i);
        }
        return answer;
    }
}
