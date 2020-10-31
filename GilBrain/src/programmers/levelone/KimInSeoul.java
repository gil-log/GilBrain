package programmers.levelone;

//https://programmers.co.kr/learn/courses/30/lessons/12919
final class Solution {
    public String solution(String[] seoul) {
       
        String kim = "Kim";
        
        int index = 0;
        for(String inSeoul : seoul){
            if(inSeoul.equals(kim))
                return "김서방은 "+Integer.toString(index)+"에 있다";
            index++;
        }
        return "";
    }
}
public class KimInSeoul {

    
}