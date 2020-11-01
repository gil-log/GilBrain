package programmers.levelone;
            //12, 14 > 12 >> 1 2 3 4 6 12   // 14 >> 1 2 7 14
            // 최소 공배수 >> 공통된 가장 작은 약수 * 각자 그 약수에 맞는 짝의 수 곱하기
            // ex 2 * 6 * 7
            // 최대 공약수 >> 약수 중에서 가장 큰값
            
            // 숫자를 쪼갠다 약수로 각각
            // 1을 제외한 약수 중에서 서로 겹치는게 있는지 본다
            // >> 없을 경우에 최대 공약수 = 1 , 최소 공배수 = n * m
            
            // >> 있을 경우에 최대 공약수 = 약수 중 가장 큰값
            //    최대랑 최소값 저장하면서 스캔 ㄱㄱ
            // 
            // 1, 2 , 5 , 10     , 1 , 3 , 5 , 15  면 최대, 최소 공약수가 같다.
            // >> 최대, 최소 공약수 같으면 일단 최대 공약수는 그 수 맞고
            // 최소 공배수  5*2*3 3 0  맞네 굳
            
            // 핵심 최소 공약수를 찾고 그게 해당하는 각자의 짝의 수를 어떻게 매칭 시키냐
            // 맵?? 맵에서 키값을 알수가 있다 asList 쓰면 ㅇㅋㅇㅋ

//https://programmers.co.kr/learn/courses/30/lessons/12940#
final class Solution {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        
        answer[0] = gcd(n, m);
        answer[1] = n * m / answer[0];
        
        
        return answer;
    }
    
    public int gcd(int n, int m){
        int bigNum = n;
        int smallNum = m;
        int temp = 0;
        
        while(smallNum != 0){
            temp = bigNum % smallNum;
            bigNum = smallNum;
            smallNum = temp;
        }
        
        return bigNum;
    }
}
public class MinDivisorAndMaxDivisor {

    
}
