package algorithm;

public class Q15 {
    public int solution(int n) {
        int x;
        for (x=1; x<=n; x++) {
            if (n%x == 1) {
                return x;
            }
        }
        return x;
    }
}
