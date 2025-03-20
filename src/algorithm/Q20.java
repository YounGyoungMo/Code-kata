//package algorithm;
//
//import java.util.ArrayList;
//import java.util.List;
//
//public class Q20 {
//    public long solution(long n) {
//        String toString = Long.toString(n);
//        long[] numbers = new long[toString.length()];
//
//        for (int i = 0; i < toString.length(); i++) {
//            numbers[i] = toString.charAt(i);
//        }
//        // n =  118372               i , i+1
//        // numbers = {1,1,8,3,7,2}   {3,7}
//        // numbers = {1,1,8,3,7,2}
//        // numbers = {1,8,1,3,7,2}
//        // numbers = {1,8,3,1,7,2}
//        // numbers = {1,8,3,7,1,2}
//        // numbers = {1,8,3,7,2,1}
//
//
//
//        for (int i = 0; i < toString.length(); i++) {
//            for (int j = 0; j < toString.length(); j++) {
//                if (numbers[i + 1] > numbers[i]) {
//                    long tmp = numbers[i];
//                    numbers[i] = numbers[i + 1];
//                    numbers[i + 1] = tmp;
//                }
//            }
//        }
//
//
//
//
//
//       //873211 리턴
//
//
//
//
//
//
//    }
//}
