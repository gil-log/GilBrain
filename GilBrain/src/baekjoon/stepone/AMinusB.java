package baekjoon.stepone;

//https://www.acmicpc.net/problem/1001

import java.util.Scanner;

public class AMinusB {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String firstScanString = scanner.next();

        String secondScanString = scanner.next();

        int a = Integer.parseInt(firstScanString);

        int b = Integer.parseInt(secondScanString);

        int result = a - b;

        System.out.println(result);

    }

}
