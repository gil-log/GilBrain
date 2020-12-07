package programmers.leveltwo;

import java.util.Arrays;

//https://programmers.co.kr/learn/courses/30/lessons/42747
final class Solution {
    public int solution(int[] citations) {
        int answer = 0;

        Arrays.sort(citations);

        int length = citations.length;
        int maxCitation = 0;

        int countTempCitation = 0;

        for (int citation = 1; citation <= 10000; citation++) {
            for (int i = 0; i < length; i++) {

                int quotation = citations[i];

                if (citation <= quotation)
                    countTempCitation++;
                if (citation > quotation || i == length - 1) {
                    if (countTempCitation >= citation)
                        if (maxCitation < citation)
                            maxCitation = citation;

                    countTempCitation = 0;
                    continue;
                }
            }

            if (citations[length - 1] < citation)
                break;
        }

        answer = maxCitation;

        return answer;
    }
}

public class HIndex {

}