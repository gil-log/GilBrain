package programmers.levelone;

//https://programmers.co.kr/learn/courses/30/lessons/12918
class Solution {
    public boolean solution(String s) {
        boolean answer = false;

        int leng = s.length();
        if(leng==4 || leng==6){
            for(int i = 0 ; i < s.length(); i ++){
                if((int)s.charAt(i)>=97 && (int)s.charAt(i)<=122)
                    return false;
            }
            return true;
        }

        
        return answer;
    }
}
public class MoonjaDarugi {

    
}
