package baekjoon.stepone;

import java.util.Scanner;

//https://www.acmicpc.net/problem/10869

public class FourRuleCalculations {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String firstScanString = scanner.next();

        String secondScanString = scanner.next();

        int aInt = Integer.parseInt(firstScanString);

        int bInt = Integer.parseInt(secondScanString);

        double aDouble = (double) aInt;

        double bDouble = (double) bInt;

        int aPlusB = aInt + bInt;

        int aMinusB = aInt - bInt;

        int aMultipleB = aInt * bInt;

        int aDivdeB = aInt / bInt;

        int aModB = aInt % bInt;

        System.out.println(aPlusB);
        System.out.println(aMinusB);
        System.out.println(aMultipleB);
        System.out.println(aDivdeB);
        System.out.println(aModB);

    }

}