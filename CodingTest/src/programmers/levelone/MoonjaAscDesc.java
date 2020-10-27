package programmers.levelone;
import java.util.Arrays;
//https://programmers.co.kr/learn/courses/30/lessons/12917
final class Solution {
  public String solution(String s) {
      String answer = "";
      
      char[] charArray = new char[s.length()];
      
      for(int i = 0 ; i < s.length(); i++){
          charArray[i] = s.charAt(i);
      }
      
      Arrays.sort(charArray);
      
      for(int i = (s.length()-1) ; i > -1; i--){
          answer+=charArray[i];
      }
      return answer;
  }
}
public class MoonjaAscDesc {

}
