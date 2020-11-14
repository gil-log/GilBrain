
import java.math.BigInteger;

//https://programmers.co.kr/learn/courses/30/lessons/62048
final class Solution {
    public long solution(int w, int h) {

        long longW = (long) w;

        long longH = (long) h;

        long answer = longW * longH;

        int gcd = BigInteger.valueOf(w).gcd(BigInteger.valueOf(h)).intValue();

        long smallW = w / gcd;

        long smallH = h / gcd;

        long wastedPaper = smallW + smallH - 1;

        answer -= wastedPaper * gcd;

        return answer;
    }
}

public class FineSquare {

}
