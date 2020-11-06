//https://programmers.co.kr/learn/courses/30/lessons/12954
final class Solution {
    public long[] solution(int x, int n) {
        long[] answer = new long[n];
        
        int plusInteger = x;
        
        long plusLong = x;
        
        for(int i = 0 ; i < n ; i ++){
            answer[i] = plusLong;
            plusLong += plusInteger;
        }
        
        return answer;
    }
}
public class NNumberLengthX {
    
}
