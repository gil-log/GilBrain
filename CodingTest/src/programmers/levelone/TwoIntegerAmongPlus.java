package programmers.levelone;
//https://programmers.co.kr/learn/courses/30/lessons/12912
class Solution {
  public long solution(int a, int b) {
      
      long answer = 0;
      
      if(a == b)
          return a;
      
      // 4 7 > 7*8/2 - 4 * 5 / 2 +4  28-10+4  22    4 5 6 7 22
      
      if(a > b){
          
          for(int i = b; i <= a; i++){
              answer += i;
          }
          
          //answer = (a*(a+1))/2 - (b*(b+1))/2 + b;
      } else {
          for(int i = a; i <= b; i++){
              answer += i;
          }
          //answer = (b*(b+1))/2 - (a*(a+1))/2 +a;
      }
      
      
      
      return answer;
  }
}
public class TwoIntegerAmongPlus {

}
