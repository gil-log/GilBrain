package programmers.leveltwo;

//https://programmers.co.kr/learn/courses/30/lessons/60057
final class Solution {
    public int solution(String s) {
        int length = s.length();
        if (length == 1)
            return 1;
        int answer = 1001;

        for (int i = 1; i <= length / 2; i++) {
            String nowStr, nextStr = "", zipStr = "";
            int sameCount = 1;
            for (int j = 0; j <= length / i; j++) {
                int beginIndex = i * j;
                int endIndex = i * (j + 1) > length ? length : i * (j + 1);
                nowStr = nextStr;
                nextStr = s.substring(beginIndex, endIndex);

                if (nowStr.equals(nextStr)) {
                    sameCount++;
                } else {
                    String frontNum = sameCount == 1 ? "" : String.valueOf(sameCount);
                    zipStr += (frontNum + nowStr);
                    sameCount = 1;
                }
            }
            String frontNum = sameCount == 1 ? "" : String.valueOf(sameCount);
            zipStr += (frontNum + nextStr);
            int zipLength = zipStr.length();
            answer = answer > zipLength ? zipLength : answer;
        }
        return answer;
    }
}

public class StringCompression {

}
