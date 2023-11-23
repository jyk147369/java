package day04;

import java.util.Scanner;

public class CarRacing {
    public static void main(String[] args) {

        Scanner sc1 = new Scanner(System.in);
        System.out.println("경주할 자동차의 수를 입력하세요 : ");
        Integer carNum = sc1.nextInt();

        // 배열생성
        String[] carName = new String[carNum]; // 배열의 길이 설정

        Scanner sc2 = new Scanner(System.in);

        for (int i = 0; i < carNum; i++) {
            // 문자열 입력
            System.out.println("경주할 자동차의 이름을 입력하세요 : ");
            carName[i] = sc2.nextLine();
        }

        for (int i = 0; i < carNum; i++) {
            System.out.println("경주할 자동차의 이름은: " + carName[i] + "입니다.");
        }

        Scanner sc3 = new Scanner(System.in);
        System.out.println("시도할 횟수를 입력하세요 : ");
        Integer raceNum = sc3.nextInt();

        for (int i = 0; i < raceNum; i++) {
            Scanner sc4 = new Scanner(System.in);
            System.out.println("성공시 앞으로 갈 거리를 입력하세요 : ");
            Integer movingNum = sc4.nextInt();

            Integer randomNum = (int) (Math.random() * 9);
            System.out.println("뽑은 숫자는 " + randomNum + "입니다.");

            if (randomNum >= 4) {
                // x가 앞으로 전진
            } else {
                // x는 그대로
            }
        }


    }
}
