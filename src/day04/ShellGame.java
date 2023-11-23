package day04;

import java.util.Scanner;

public class ShellGame {
    // 야바위 게임

    // 3개 중 하나 고르는
    //      3개 중에 정답 1개 -> 점수 1점 증가
    //      3개 중에 꽝 1개 -> 하트 1개 줄어듦
    //      3개 중에 1개 폭탄 -> 점수 1 감소, 해당 플레이어만 하트 1감소

    // 클리어 조건
    //      플레이어들의 점수가 3점이면 클리어

    // 플레이어 2명
    //      하트 개수, 하트의 초기값은 private
    //      점수는 공유


    Integer player;
    Integer heart;


    public static void main(String[] args) {

        // shell의 개수는 3개

        int[] shell = new int[3];

        // 섞기
        for (int i = 0; i < 3; i++) {

            // 중복제거
            shell[i] = (int) (Math.random() * 3) + 1;
            for (int j = 0; j < i; j++) {
                if (shell[i] == shell[j]) {
                    i--;
                }
            }
        }

        System.out.println("다음 숫자 중 하나를 고르시오.");
        for (int i = 0; i < 3; i++) {
            System.out.print(shell[i] + " ");
        }

        // player가 하나를 고른다. player가 고른 숫자는 pick
        Scanner sc = new Scanner(System.in);
        int pick = 0;
        pick = sc.nextInt();
        pick = pick-1;

        // player가 123 중 숫자 i를 고르면 shell[i]를 고르는 것, shell 안에 있는 수는 랜덤하다
        if(shell[pick]==1) {
            System.out.println("정답!");
        } else if (shell[pick]==2) {
            System.out.println("꽝!");
        } else if (shell[pick]==3){
            System.out.println("폭탄!");
        } else {
            System.out.println("오류입니다.");
        }
    }
}

