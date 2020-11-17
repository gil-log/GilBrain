//https://programmers.co.kr/learn/courses/30/lessons/12899
final class Solution {
    public String solution(int n) {
        // 1 1 = 1, 2 = 2, 3 = 4
        // 2 4 = 11, 5 = 12, 6 = 14
        // 3 7 = 21, 8 = 22, 9 = 24
        // 4 10 = 41, 11 = 42, 12 = 44
        // 5 13 = 111, 14 = 112, 15 = 114
        // 6 16 = 121, 17 = 122, 18 = 124
        // 7 19 = 141

        // 맨 뒤의 숫자는 n % 3 == 0 이면 4 아니면 그 % 자체이고
        // 그다음 /3 나눠서 딱 떨어질때까지 의 숫자 -1 을 한 수가 앞에 붙는다.

        String answer = "";

        long recursionResult = divideThreeRecursion((long) n);

        answer = Long.toString(recursionResult);
        return answer;
    }

    public long divideThreeRecursion(long n) {

        long divideThree = (long) Math.ceil((double) n / 3) - 1;

        if (divideThree == 0) {
            long result = n % 3;
            if (result == 0)
                result = 4;
            return result;
        }
        long prefix = divideThreeRecursion(divideThree) * 10;

        long suffix = n % 3;
        if (suffix == 0)
            suffix = 4;
        long result = prefix + suffix;
        return result;
    }
}

public class OneTwoFourCountry {

}
