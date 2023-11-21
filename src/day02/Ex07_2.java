package day02;

import java.util.Scanner;

public class Ex07_2 {
    public static void main(String[] args) {
        int [] unit = {50000, 10000, 1000, 500, 100, 50, 10, 1};

        // 정수로 된 돈의 액수를 입력 받기
        // ex)675652원
        System.out.print("액수를 입력하세요. : ");
        Scanner sc = new Scanner(System.in);

        //입력받은 수를 변수에 저장
        int money = sc.nextInt();

        System.out.println("입력하신 돈은 " + money + "원 입니다.");

        int[] ea = new int[8];

        for(int i=0; i<=7; i++){
            ea[i] = money/unit[i];
            System.out.println(unit[i]+"원 개수는 " + ea[i] + "장 입니다.");
            money = money - ea[i]*unit[i];
        }
    }
}
