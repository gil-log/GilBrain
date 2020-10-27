package programmers.levelone;
//https://programmers.co.kr/learn/courses/30/lessons/12916
final class Solution {
  boolean solution(String s) {
      int sum = 0 ;
      
      for(int i = 0 ; i < s.length(); i ++){
          char ch = s.charAt(i);
          if(ch == 'p' || ch == 'P')
              sum--;
          else if(ch == 'y' || ch == 'Y')
              sum++;
      }
      
      if(sum==0)
          return true;

      return false;
  }
}
public class CountingPandY {

}
