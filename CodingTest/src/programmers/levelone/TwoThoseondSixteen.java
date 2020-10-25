package programmers.levelone;

//https://programmers.co.kr/learn/courses/30/lessons/12901
// public class TwoThoseondSixteen {

     class Solution22 {
        public String solution(int a, int b) {
            int day = 0;
            
            String [] week = {"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};
            int index = 0;
            
            // �ݿ��� start
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


        
    // public static void main(String[] args) {
        
    //     Solution sol = new Solution();

    //     int a = 5;
    //     int b= 24;

    //     String ans = sol.solution(a, b);


    //     System.out.println(ans);


    // }


    public static void main(String[] args) {
        Solution22 sol = new Solution22();

        String ans = sol.solution(5, 24);

        System.out.println(ans);
    }

    }


// }
