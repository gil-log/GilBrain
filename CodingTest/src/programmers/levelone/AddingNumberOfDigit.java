package programmers.levelone;
// https://programmers.co.kr/learn/courses/30/lessons/12931
final class Solution {
    public int solution(int n) {
        int answer = 0;

        int temp = 1;
        while(temp>0){
            temp = n / 10;
            temp *= 10;
            answer += n - temp;
            n /= 10;
            temp /= 10;
        }
        
        return answer;
    }
}
public class AddingNumberOfDigit {
    
}
