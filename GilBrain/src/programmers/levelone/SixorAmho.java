package programmers.levelone;
//https://programmers.co.kr/learn/courses/30/lessons/12926
final class Solution {
    public String solution(String s, int n) {
        String answer = "";
        
        String space = " ";

        for(int i = 0 ; i < s.length(); i ++){
            
            char convertChar = s.charAt(i);
            int convertInt = (int) convertChar;
            
            
            if(convertInt==32){
                convertChar = (char) convertInt;
                answer+=convertChar;
                continue;
            }
        
            if(convertInt>=97 && convertInt <=122){
                convertInt += n;
                if(convertInt>122)
                    convertInt-=26;
            }else {
                convertInt += n;
                if(convertInt>90)
                    convertInt-=26;
            }
            
            convertChar = (char) convertInt;
            answer+=convertChar;
        }
        
        return answer;
    }
}
public class SixorAmho {
    
}
