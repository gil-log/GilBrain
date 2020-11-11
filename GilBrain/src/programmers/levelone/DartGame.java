package programmers.levelone;

// https://programmers.co.kr/learn/courses/30/lessons/17682
final class Solution {
    public int solution(String dartResult) {
        int answer = 0;

        String bonus = dartResult.replaceAll("[0-9]", "");

        System.out.println(bonus);

        String tenToX = dartResult.replaceAll("10", "X");

        String scores = tenToX.replaceAll("[SDT*#]", "");
        System.out.println(scores);

        int[] scoreArr = new int[scores.length()];

        int bonusIndex = 0;

        for (int i = 0; i < scores.length(); i++) {
            // char 0 = int 48,
            char scoreChar = scores.charAt(i);
            int score = (int) scoreChar - 48;
            if (scoreChar == 'X')
                score = 10;
            System.out.println(score);

            char bonusChar = bonus.charAt(bonusIndex);

            if (bonusChar == 'S') {

                scoreArr[i] = score;

                if (bonusIndex >= bonus.length() - 1)
                    break;

                char nextBonusChar = bonus.charAt(bonusIndex + 1);

                if (nextBonusChar == '*') {
                    if (i != 0)
                        scoreArr[i - 1] *= 2;
                    scoreArr[i] = score * 2;
                    bonusIndex += 2;
                } else if (nextBonusChar == '#') {
                    scoreArr[i] = score * (-1);
                    bonusIndex += 2;
                } else {
                    bonusIndex++;
                }

            } else if (bonusChar == 'D') {

                score = (int) Math.pow(score, 2);
                scoreArr[i] = score;

                if (bonusIndex >= bonus.length() - 1)
                    break;

                char nextBonusChar = bonus.charAt(bonusIndex + 1);

                if (nextBonusChar == '*') {
                    if (i != 0)
                        scoreArr[i - 1] *= 2;
                    scoreArr[i] = score * 2;
                    bonusIndex += 2;
                } else if (nextBonusChar == '#') {
                    scoreArr[i] = score * (-1);
                    bonusIndex += 2;
                } else {
                    bonusIndex++;
                }

            } else if (bonusChar == 'T') {
                score = (int) Math.pow(score, 3);
                scoreArr[i] = score;

                if (bonusIndex >= bonus.length() - 1)
                    break;

                char nextBonusChar = bonus.charAt(bonusIndex + 1);

                if (nextBonusChar == '*') {
                    if (i != 0)
                        scoreArr[i - 1] *= 2;
                    scoreArr[i] = score * 2;
                    bonusIndex += 2;
                } else if (nextBonusChar == '#') {
                    scoreArr[i] = score * (-1);
                    bonusIndex += 2;
                } else {
                    bonusIndex++;
                }
            }
        }

        for (int score : scoreArr)
            answer += score;
        return answer;
    }
}

public class DartGame {

}
