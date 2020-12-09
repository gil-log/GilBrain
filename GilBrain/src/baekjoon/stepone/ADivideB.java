package baekjoon.stepone;

//https://www.acmicpc.net/problem/1008

import java.util.Scanner;

public class ADivideB {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String firstScanString = scanner.next();

        String secondScanString = scanner.next();

        double a = (double) Integer.parseInt(firstScanString);

        double b = (double) Integer.parseInt(secondScanString);

        double result = a / b;

        System.out.println(result);

    }
}
