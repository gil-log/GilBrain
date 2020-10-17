package programmers.levelone;

//https://programmers.co.kr/learn/courses/30/lessons/12901
public class TwoThoseondSixteen {

}
class Solution {
    public String solution(int a, int b) {
        int day = 0;
        
        String [] week = {"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};
        //1월 30일, 2월 29일, 3월 31일, 4월 30일, 5월 31일, 6월 30-일, 7월 31, 8 31, 9 30, 10 31, 11 30, 12 31일
        //
        
        int index = 0;
        
        // 금요일 start
        if(a==1||a==4||a==7){
            index = 5;
        } else if(a==2||a==8){
            index = 1;
        } else if(a==3||a==11){
            index = 2;
        } else if(a==5){
            index = 0;
        } else if(a==6){
            index = 3;
        } else if(a==9||a==12){
            index = 4;
        } else if(a==10){
            index = 6;
        }
        
        day = (b%7) - 1;
        index += day;
        index %= 7;
        
        return week[index];
    }
}