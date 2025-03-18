package algorithm;

public class Q19 {

        public long solution(long n) {
            long x = (long) Math.sqrt(n);

            if (x * x == n) {
                return (x + 1)*(x + 1);
            }
            return -1;

        }
}
