package programmers.levelone;

import java.util.Arrays;

//https://programmers.co.kr/learn/courses/30/lessons/12932
final class Solution {
    public int[] solution(long n) {
        
        String number = Long.toString(n);
        
        String[] numbers = number.split("");
        
        int[] answer = new int[number.length()];
        
        int index = 0 ;
        for(int i = numbers.length - 1; i>-1 ; i--){
            answer[index] = Integer.parseInt(numbers[i]);
            index ++;
        }
        return answer;
    }
}
public class NaturalNumberReverse {

    
}