import java.util.Set;
import java.util.TreeSet;

//https://programmers.co.kr/learn/courses/30/lessons/42839?language=java
final class Solution {

    int answer = 0;
    Set<Integer> alredyExistsPrimeNumSet = new TreeSet<Integer>();

    public int solution(String numbers) {

        char[] numberChar = numbers.toCharArray();

        int length = numberChar.length;

        char[] combinationNumChar = new char[length];

        boolean[] used = new boolean[length];

        for (int i = 1; i <= length; i++) {
            recursionCombination(numberChar, used, combinationNumChar, 0, length, i);
        }

        return answer;
    }

    public void recursionCombination(char[] numberChar, boolean[] used, char[] combinationNumChar, int count,
            int length, int maxCombination) {
        if (count == maxCombination) {
            if (isPrimeNumber(combinationNumChar, maxCombination))
                answer++;
            return;
        }

        for (int i = 0; i < length; i++) {
            if (used[i])
                continue;

            used[i] = true;
            combinationNumChar[count] = numberChar[i];
            recursionCombination(numberChar, used, combinationNumChar, count + 1, length, maxCombination);
            used[i] = false;
        }

    }

    public boolean isPrimeNumber(char[] combinationNumChar, int maxCombination) {

        if (combinationNumChar[0] == '0')
            return false;

        String combinationNumStr = "";

        for (int i = 0; i < maxCombination; i++) {
            combinationNumStr += combinationNumChar[i];
        }

        int tempNumber = Integer.parseInt(combinationNumStr);

        if (tempNumber <= 1 || alredyExistsPrimeNumSet.contains(tempNumber))
            return false;

        for (int i = 2; i * i <= tempNumber; i++) {
            if (tempNumber % i == 0)
                return false;
        }

        alredyExistsPrimeNumSet.add(tempNumber);

        return true;
    }

}

public class FindPrimeNumber {

}
