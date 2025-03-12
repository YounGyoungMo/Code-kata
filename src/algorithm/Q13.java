package algorithm;

public class Q13 {
    public static int solution(int number) {
        int sum = 0;
        int N = -1;
        while (number != 0) {
            N = number % 10;
            sum += N;
            number /= 10;
        }
        return sum;
    }

}
