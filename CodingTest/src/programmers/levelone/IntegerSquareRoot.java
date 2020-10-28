//https://programmers.co.kr/learn/courses/30/lessons/12934
class Solution {
    public long solution(long n) {
        long answer = -1;
        
        double squareRoot = Math.sqrt((double)n);
        
        if(squareRoot == Math.floor(squareRoot))
            answer = (long)Math.pow(squareRoot+1,2);
        
        return answer;
    }
}
public class IntegerSquareRoot {
    
}
