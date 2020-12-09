package baekjoon.stepone;

//https://www.acmicpc.net/problem/2588

import java.util.Scanner;

public class Mutiple {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();

        int b = scanner.nextInt();

        int bOneNum = b - ((b / 10) * 10);

        int bTenNum = (b / 10) - (b / 100) * 10;

        int bHundreadNum = b / 100;

        int resultLineThird = a * bOneNum;
        int resultLineFourth = a * bTenNum;
        int resultLineFifth = a * bHundreadNum;

        int resultLineSixth = resultLineFifth * 100 + resultLineFourth * 10 + resultLineThird;

        System.out.println(resultLineThird);
        System.out.println(resultLineFourth);
        System.out.println(resultLineFifth);
        System.out.println(resultLineSixth);

    }
}
