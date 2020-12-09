package baekjoon.stepone;

import java.util.Scanner;

public class Remainder {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String firstScanString = scanner.next();

        String secondScanString = scanner.next();

        int c = scanner.nextInt();

        int a = Integer.parseInt(firstScanString);

        int b = Integer.parseInt(secondScanString);

        int firstLine = (a + b) % c;
        int secondLine = ((a % c) + (b % c)) % c;

        int thirdLine = (a * b) % c;
        int fourthLine = ((a % c) * (b % c)) % c;

        System.out.println(firstLine);
        System.out.println(secondLine);
        System.out.println(thirdLine);
        System.out.println(fourthLine);

    }
}
