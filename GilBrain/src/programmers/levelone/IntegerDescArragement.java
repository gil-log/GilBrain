package programmers.levelone;

import java.util.Arrays;
//https://programmers.co.kr/learn/courses/30/lessons/12933
final class Solution {
    public long solution(long n) {
        long answer = 0;
        
        String number = Long.toString(n);
        
        String[] numbers = new String[number.length()];
        
        numbers = number.split("");
        
        Arrays.sort(numbers);
        
        String answerStr = "";
        
        for(int i = numbers.length - 1; i > -1 ; i--){
            answerStr += numbers[i];
        }
        
        answer = Long.parseLong(answerStr);
        
        return answer;
    }
}

public class IntegerDescArragement {
    
}
