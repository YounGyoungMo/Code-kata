package algorithm;

import java.util.List;

public class Q16 {
    public long[] solution(int x, int n) {
        long[] list = new long[n];
        int num = 0;
        if (n >= 1) {
            for (long i = x; num < n; i += x) {
                list[num] = i;
                num++;
            }
        }
        return list;
    }

}


