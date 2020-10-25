import java.util.List;
import java.util.LinkedList;
import java.util.ArrayList;

public class FindPrimeNum {

    class Solution {
        public int solution(int n) {
            int answer = 3;

            if (n == 2)
                return 1;
            if (n == 3 || n == 4)
                return 2;
            if (n == 5)
                return 3;

            List<Integer> list = new ArrayList<>(299999);

            // 1000000 -500000 - 333333 - 200000 + 166666 + 100000 + 2*33,333

            test: for (int i = 6; i <= n; i++) {
                if ((i % 2) == 0)
                    continue;
                if ((i % 3) == 0)
                    continue;
                if ((i % 5) == 0)
                    continue;

                for (int j = 0; j < list.size(); j++) {
                    if (i % list.get(j) == 0)
                        continue test;
                    if (Math.sqrt(i) < Math.sqrt(list.get(j)))
                        continue test;
                }
                list.add(i);
                answer++;
            }
            return answer;
        }
    }


    // public class Solution {

    //     public int solution(int n) {
    //        int sum = 1;
    //        outer: for (int i = 3; i <= n; i++) {
    //           for (int j = 2; j <= Math.sqrt(i); j++) {
    //              if (i % j == 0)
    //                 continue outer; 
    //           }
    //           sum++;
    //        }
    //        return sum;
    //     }
    //  }
}