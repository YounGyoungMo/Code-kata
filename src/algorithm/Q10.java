package algorithm;
// 10. 배열의 평균값
public class Q10 {

        public double solution(int[] numbers) {
            int sum = 0;
            for (int i=0; i< numbers.length; i++) {
                sum += numbers[i];
            }

            double average = (double) sum / numbers.length;
            return average;
        }

}
