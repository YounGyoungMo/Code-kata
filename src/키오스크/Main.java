package 키오스크;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // choice 초기화
        int choice = -1;

        // List 선언
        List<MenuItem> menuItems = new ArrayList<>();

        //객체 리스트에 메뉴 정보를 담은 객체를 생성해서 추가
        menuItems.add(new MenuItem("ShackBurger   ", 6.9, "토마토, 양상추, 쉑소스가 토핑된 치즈버거"));
        menuItems.add(new MenuItem("SmokeShack    ", 8.9, "베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거"));
        menuItems.add(new MenuItem("Cheeseburger  ", 6.9, "포테이토 번과 비프패티, 치즈가 토핑된 치즈버거"));
        menuItems.add(new MenuItem("Hamburger     ", 5.4, "비프패티를 기반으로 야채가 들어간 기본버거"));

        // choice가 0이 되면 반복문 종료
        while(choice != 0) {

            // 메뉴 번호 할당
            int number = 1;

            // 메뉴판 출력

            System.out.println("[ \uD83D\uDCCC SHAKESHACK MENU ]");

            for (MenuItem menu : menuItems) {
                System.out.print(number++ + ". ");
                menu.printMenu();
            }

            System.out.println("0. 종료      | 종료");

            // 번호 입력 처리 및 예외 처리
            try {
                // 번호 입력 받기
                choice = scanner.nextInt();

                // 입력받은 숫자에 따라 다르게 실행되는 명령문
                if (choice == 0) {
                    System.out.println("주문을 종료합니다. ");
                    break;
                } else if (choice == 1) {
                    System.out.println("ShackBurger를 선택하셨습니다.");
                } else if (choice == 2) {
                    System.out.println("SmokeShack를 선택하셨습니다.");
                } else if (choice == 3) {
                    System.out.println("Cheeseburger를 선택하셨습니다.");
                } else if (choice == 4) {
                    System.out.println("Hamburger를 선택하셨습니다.");
                }
                // 유효하지 않은 값을 입력받았을 경우 예외 처리
                else {
                    System.out.println("유효하지 않은 선택입니다. 0-4 사이의 번호를 입력해주세요. ");
                }
            }
            // 잘못된 자료형의 값을 입력받을 경우 예외 처리
            catch (InputMismatchException e) {
                System.out.println("🚨 유효한 숫자만 입력 가능합니다. 다시 시도해주세요.");
                // 잘못된 입력(ex: 문자열 등)을 입력 버퍼에서 제거
                scanner.next();
            }

        }
    }
}