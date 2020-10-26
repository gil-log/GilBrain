package programmers.levelone;
//https://programmers.co.kr/learn/courses/30/lessons/12922
final class Solution {
    public String solution(int n) {
        StringBuffer strBuff = new StringBuffer();
        
        int flag = 0;
        for(int i = 0 ; i < n ; i ++){
            if(flag == 0){
                strBuff.append("수");
                flag = 1;
            }else{
                strBuff.append("박");
                flag = 0;
            }
           
        }
        return strBuff.toString();
    }
}
public class WaterMelon {
    
}
