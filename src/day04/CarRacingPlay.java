package day04;

import java.util.Scanner;

public class CarRacingPlay {
    public static void main(String[] args) {

        Scanner sc1 = new Scanner(System.in);
        System.out.println("경주할 자동차의 수를 입력하세요 : ");
        // 숫자 입력
        // carNum이 내가 입력한 정수 carNum=경주할 자동차의 수
        Integer carNum = sc1.nextInt();

        // 내가 입력한 문자열 carName[]=경주할 자동차의 이름
        String[] carName = new String[carNum];
        Scanner sc2 = new Scanner(System.in);

        for (int i = 0; i < carNum; i++) {
            // 문자열 입력
            System.out.println("경주할 자동차의 이름을 입력하세요 : ");
            carName[i] = sc2.nextLine();
        }

        // 경주할 자동차 이름 출력
        for (int i = 0; i < carNum; i++) {
            System.out.println("경주할 자동차의 이름은: " + carName[i] + "입니다.");
        }

        // 경주할 자동차 생성자
        Car[] car = new Car[carNum];
        for(int i=0; i<carNum; i++) {
            car[i] = new Car(carName[i], 0);
        }

        Scanner sc3 = new Scanner(System.in);
        System.out.println("경주 횟수를 입력하세요 : ");
        Integer raceNum = sc3.nextInt();

        for (int j=0; j<raceNum; j++) {

            System.out.println("["+(j+1)+"회차]");

            for (int i = 0; i < carNum; i++) {
                car[i].moving();
            }
        }

        for (int i = 0; i < carNum; i++) {
            car[i].finalGoal();
        }

    }
}
