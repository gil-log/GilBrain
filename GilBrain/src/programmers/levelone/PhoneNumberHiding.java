package programmers.levelone;

//https://programmers.co.kr/learn/courses/30/lessons/12948
final class Solution {
    public String solution(String phone_number) {
        String answer = "";
        
        int phoneNumLength = phone_number.length();
        
        if(phoneNumLength == 4){
            return phone_number;
        }
        
        String[] phoneNum = phone_number.split("");
        
        for(int i = 0 ; i < phoneNumLength - 4; i++){
            answer += "*";
        }
        
        for(int i = phoneNumLength - 4; i<phoneNumLength; i++){
            answer += phoneNum[i];
        }
        
        return answer;
    }
}

public class PhoneNumberHiding {
    
}
