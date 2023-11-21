package day02;

import java.util.Scanner;

// 정수로 된 돈의 액수를 입력받아
// 오만원권, 만원권, 천원권, 500원짜리 동전, 100원짜리 동전, 50원짜리 동전, 10원짜리 동전, 1원짜리 동전이
// 각 몇 개로 변환되는지 출력
// unit 배열을 출력
public class Ex07 {
    public static void main(String[] args) {
        int [] unit = {50000, 10000, 1000, 500, 100, 50, 10, 1};

        // 정수로 된 돈의 액수를 입력 받기
        // ex)675652원
        System.out.print("액수를 입력하세요. : ");
        Scanner sc = new Scanner(System.in);

        //입력받은 수를 변수에 저장
        int money = sc.nextInt();

        System.out.println("입력하신 돈은 " + money + "원 입니다.");

        // 입력 받은 돈의 액수를 50000으로 나누고 몫을 a라고 지정
        // 675652/50000=13.xx
        // a = 13
        int a = money/unit[0];

        // 675652-(13*50000)=25652
        // 25652/10000=2.5xx
        // b = 2
        int b = (money - (a*unit[0]))/unit[1];

        // 675652-(13*50000+2*10000)=5652
        // 5652/1000=5.xx
        // c = 5
        int c = (money - (a*unit[0]+b*unit[1]))/unit[2];
        int d = (money - (a*unit[0]+b*unit[1]+c*unit[2]))/unit[3];
        int e = (money - (a*unit[0]+b*unit[1]+c*unit[2]+d*unit[3]))/unit[4];
        int f = (money - (a*unit[0]+b*unit[1]+c*unit[2]+d*unit[3]+e*unit[4]))/unit[5];
        int g = (money - (a*unit[0]+b*unit[1]+c*unit[2]+d*unit[3]+e*unit[4]+f*unit[5]))/unit[6];
        int h = (money - (a*unit[0]+b*unit[1]+c*unit[2]+d*unit[3]+e*unit[4]+f*unit[5]+g*unit[6]))/unit[7];

        System.out.println("오만 원권은 " + a + "장 입니다.");
        System.out.println("만 원권은 " + b + "장 입니다.");
        System.out.println("천 원권은 " + c + "장 입니다.");
        System.out.println("오백 원 동전은 " + d + "개 입니다.");
        System.out.println("백 원 동전은 " + e + "개 입니다.");
        System.out.println("오십 원 동전은 " + f + "개 입니다.");
        System.out.println("십 원 동전은 " + g + "개 입니다.");
        System.out.println("일 원 동전은 " + h + "개 입니다.");
    }
}
