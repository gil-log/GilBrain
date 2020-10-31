package programmers.levelone;
//https://programmers.co.kr/learn/courses/30/lessons/67256
final class Solution {
    public String solution(int[] numbers, String hand) {
        String answer = "";
        
        // 왼손, 오른손 위치
        int [] leftHandLocation = {0,0};
        int [] rightHandLocation = {0,2};
        
        // 인덱스 [0][] ~ [9][] 숫자 0~9 표현, 숫자 0 = {0,1}, 숫자 9 = {1,2} 
        // 숫자 키패드 * = {0,0} 인덱스 10 , 키패드 # = {0,2} 인덱스 11
        int [][] keyPad = {{0,1}, {3,0}, {3,1}, {3,2}, {2,0}, {2,1}, {2,2}, {1,0}, {1,1}, {1,2}, {0,0}, {0,2}};
        
        int leftDistance = 0;
        int rightDistance = 0;
        
        int [] keyLocation = new int [2];
        
        for(int number : numbers){
            leftDistance = Math.abs(keyPad[number][0] - leftHandLocation[0]) + Math.abs(keyPad[number][1] - leftHandLocation[1]);
            rightDistance = Math.abs(keyPad[number][0] - rightHandLocation[0]) + Math.abs(keyPad[number][1] - rightHandLocation[1]);
            
            if(number == 1 || number == 4 || number == 7){
                answer += "L";
                leftHandLocation[0] = keyPad[number][0];
                leftHandLocation[1] = keyPad[number][1];
            }else if (number == 3 || number == 6 || number == 9){
                answer += "R";
                rightHandLocation[0] = keyPad[number][0];
                rightHandLocation[1] = keyPad[number][1];
            } else{
                            
            // 왼손 거리가 더 머네
            if(leftDistance > rightDistance){
                answer += "R";
                rightHandLocation[0] = keyPad[number][0];
                rightHandLocation[1] = keyPad[number][1];
            } else if(leftDistance < rightDistance){
                answer += "L";
                leftHandLocation[0] = keyPad[number][0];
                leftHandLocation[1] = keyPad[number][1];
            } else if(leftDistance == rightDistance){
                if(hand.equals("right")){
                    answer += "R";
                    rightHandLocation[0] = keyPad[number][0];
                    rightHandLocation[1] = keyPad[number][1];
                } else {
                    answer += "L";
                    leftHandLocation[0] = keyPad[number][0];
                    leftHandLocation[1] = keyPad[number][1];   
                }
            }
            }
            
        }
        
        return answer;
    }
}
public class KakaoInternKeyPad {
    
}
