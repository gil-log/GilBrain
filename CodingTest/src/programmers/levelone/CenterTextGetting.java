package programmers.levelone;

public class CenterTextGetting {

}
//https://programmers.co.kr/learn/courses/30/lessons/12903
class Solution {
 public String solution(String s) {
     String answer = "";
     
     int length = s.length();
     if(length%2==0){
         answer = s.substring(length/2-1, length/2+1);
     } else{
         answer += s.charAt(length/2);
     }
     
     
     return answer;
 }
}