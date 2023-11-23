package day04;

import java.util.Scanner;

public class CarRacingPlay {
    public static void main(String[] args) {

        Scanner sc1 = new Scanner(System.in);
        System.out.println("경주할 자동차의 수를 입력하세요 : ");
        // 숫자 입력
        // inputNum이 내가 입력한 정수 inputNum=경주할 자동차의 수
        Integer inputNum = sc1.nextInt();

        // carNum은 배열수, carNum[0]부터 carNum[inputNum]까지
        Integer[] carNum = new Integer[inputNum];
        for (int i=0; i<inputNum; i++) {
            carNum[i]= i;     // carNum[0]=0, carNum[1]=1, carNum[2]=2, ..., carNum[inputNum]=input
        }

        // 내가 입력한 문자열 carName[]=경주할 자동차의 이름
        String[] carName = new String[inputNum];
        Scanner sc2 = new Scanner(System.in);

        for (int i = 0; i < inputNum; i++) {
            // 문자열 입력
            System.out.println("경주할 자동차의 이름을 입력하세요 : ");
            carName[i] = sc2.nextLine();
        }

        // 경주할 자동차 이름 출력
        for (int i = 0; i < inputNum; i++) {
            System.out.println("경주할 자동차의 이름은: " + carName[i] + "입니다.");
        }

        // 경주할 자동차 생성자
        Car[] car = new Car[inputNum];
        for(int i=0; i<inputNum; i++) {
            car[i] = new Car(carNum[i], carName[i], 0);
        }

        Scanner sc3 = new Scanner(System.in);
        System.out.println("시도할 횟수를 입력하세요 : ");
        Integer raceNum = sc3.nextInt();

        for (int j=0; j<raceNum; j++) {

            System.out.println("["+(j+1)+"회차]");

            for (int i = 0; i < inputNum; i++) {
                car[i].moving();
            }
        }

        for (int i = 0; i < inputNum; i++) {
            car[i].finalGoal();
        }

    }
}
