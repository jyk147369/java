package day02;

import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        // 입력받기 위한 스캐너 만들기
        Scanner sc = new Scanner(System.in);

        // 숫자를 입력받을 크기가 6인 배열 만들기
        int[] inputNum = new int[6];


        // 0부터 5까지 반복
        //      배열의 반복 횟수 번째에 숫자를 입력받아서 저장
        for(int i=0; i < 6; i++) {
            inputNum[i]=sc.nextInt();
        }


        // 5부터 0까지 반복
        //      배열의 반복 횟수 번째에 숫자를 출력
        for(int i=0; i < 6; i++) {
            System.out.println(inputNum);
        }

    }
}
