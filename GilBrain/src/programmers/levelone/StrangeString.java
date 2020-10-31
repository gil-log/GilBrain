package programmers.levelone;

//https://programmers.co.kr/learn/courses/30/lessons/12930#
final class Solution {
    public String solution(String s) {
        String answer = "";
        
        int oddFlag = 0;
        char oneLetter = 'a';
        int letterCode = 0;
        
        for(int i = 0 ; i < s.length(); i++){
            oneLetter = s.charAt(i);
            letterCode = (int) oneLetter;
            
            if(oneLetter == ' '){
                answer += " ";
                oddFlag = 0;
                continue;
            }
            
            if(oddFlag == 0){
                if(letterCode >= 97){
                    letterCode -= 32;
                    oneLetter = (char)letterCode;
                }
                answer += oneLetter;
                oddFlag = 1;
            } else {
                if(letterCode <= 90){
                    letterCode += 32;
                    oneLetter = (char)letterCode;
                }
                answer += oneLetter;
                oddFlag = 0;
            }
            
        }
        
        return answer;
    }
}
public class StrangeString {
    
}
