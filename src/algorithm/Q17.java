package algorithm;

public class Q17 {
    public static void main(String[] args) {
        int[] result = solution(12345);

        // 반환된 배열을 출력
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }

    public static int[] solution(long n) {

        int length = Long.toString(n).length();
        int [] numbers = new int[length];
        int ret = 0;

        for (int i=0; i<length; i++) {
            ret = (int) ( n % 10); // 12345 % 10 = 5
            numbers[i] = ret;
            n /= 10;            //1234 % 10 = 4
        }
        return numbers;
    }
}

