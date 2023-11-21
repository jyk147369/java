package day02;

import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        // 입력받기 위한 스캐너 만들기
        Scanner sc = new Scanner(System.in);
        // 숫자를 입력받을 크기가 10인 배열 만들기
        int[] inputNum = new int[10];
        // 0부터 9까지 반복
        //      배열의 반복 횟수 번째에 숫자를 입력받아서 저장
        for(int i=0; i < 10; i++) {
            System.out.print("숫자를 입력하세요.: ");
            inputNum[i]=sc.nextInt();
        }
        // 모든 수를 저장할 변수를 생성
        int sum = 0;
        // 0부터 9까지 반복
        //      모든 수를 저장할 변수에 반복 횟수에 해당하는 배열의 값을 더해서 저장
        for(int i=0; i < 10; i++) {
            sum = sum + inputNum[i];
        }
        // 모든 수를 저장한 변수에 배열의 크기(배열변수.length)만큼 나눠서 출력
        System.out.println("입력한 숫자의 총합: " + sum);
        System.out.println("입력한 숫자의 평균: " + sum/inputNum.length);
    }
}
