package day02;

import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) {
        // 입력받기 위한 스캐너 만들기
        Scanner sc = new Scanner(System.in);
        // 월~일을 저장할 배열 만들기
        String[] weekArray = {"월", "화", "수", "목", "금", "토", "일"};
        // 숫자를 입력받을 변수 생성
        int num = 0;
        // 숫자를 입력받아 변수에 저장
        num = sc.nextInt();
        // 만약에 입력받은 숫자가 0~6이면
        //      배열에 입력받은 숫자번째 값을 출력
        if (num >= 0 && num <= 6) {
            System.out.println(weekArray[num]);
        }
        // 그렇지 않으면
        //      잘못 입력하셨습니다. 를 출력
        else {
            System.out.println("잘못 입력하셨습니다.");
        }
    }
}