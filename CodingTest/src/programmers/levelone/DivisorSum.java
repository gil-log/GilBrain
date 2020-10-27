package programmers.levelone;
import java.util.List;
import java.util.LinkedList;

//https://programmers.co.kr/learn/courses/30/lessons/12928#
class Solution {
    public int solution(int n) {
        
        if(n == 0)
            return 0;
        if(n == 1)
            return 1;
        
        int answer = n+1;
        
        int divisor = n/2;
        
        for(int i = 2 ; i < divisor; i++){
            // 나누어 떨어지면
            if(divisor < i)
                break;
            
            if(n % i == 0){
                divisor = n/i;
                if(divisor == i){
                    answer += divisor; 
                    continue;
                }
                
                answer += divisor + i;
            }
        }
        return answer;
    }
}
public class DivisorSum {
    
}
