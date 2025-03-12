package algorithm;

// 9. 짝수의 합
public class Q9 {
    int sum = 0;
    public int solution(int n) {
        for (int i=0; i<=n; i++) {
            if (i % 2 == 0) {
                sum += i;
            }
        }
        return sum;
    }
}
