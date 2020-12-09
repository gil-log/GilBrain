//https://programmers.co.kr/learn/courses/30/lessons/42842#
final class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];

        // brown = width * 2 + (height - 2) * 2
        // width + height = (brown + 4 ) / 2
        // yellow = (width - 2) * (height - 2)

        int width = (brown + 4) / 2 - 3;

        int height = 3;

        boolean isEqualYellow = true;
        while (isEqualYellow) {
            if ((width - 2) * (height - 2) == yellow) {
                answer[0] = width;
                answer[1] = height;
                break;
            }

            if (width < 3 || width < height)
                break;

            width--;
            height++;
        }

        return answer;
    }
}

public class Carpet {

}
