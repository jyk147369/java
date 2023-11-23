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

        // 경주 횟수 입력
        Scanner sc3 = new Scanner(System.in);
        System.out.println("경주 횟수를 입력하세요 : ");
        Integer raceNum = sc3.nextInt();


        // 경주 횟수만큼 세트 반복
        for (int j=0; j<raceNum; j++) {

            System.out.println("["+(j+1)+"회차]");

            // 자동차 개수만큼 랜덤뽑기 반복
            for (int i = 0; i < carNum; i++) {
                car[i].moving();
            }
        }

        for (int i=0; i < carNum; i++) {
            car[i].finalGoal();
        }

        // 일단 배열 중 첫번째를 최대값 변수에 저장
        Integer maxCarX=car[0].carX;
        for (int i=0; i<carNum; i++){
            // 배열 중 첫번째와 나머지들을 비교하면서 큰 수가 있으면 최대값 변수에 저장하도록
            if(car[0].carX<=car[i].carX){
                maxCarX = car[i].carX;      // 결국 최대값을 가진 car[i].carX가 최대값 변수에 저장됨
            }
        }

        System.out.print("최종 우승자 : ");
        for(int i=0; i<carNum; i++) {
            if (maxCarX == car[i].carX) {
                System.out.print(car[i].carName + " ");
            }
        }

    }
}
