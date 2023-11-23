package day04;

import java.util.Scanner;

public class ShellGamePlay {
    public static void main(String[] args) {
        Player[] player = new Player[2];
        player[0] = new Player(1,5,0);
        player[1] = new Player(2, 5,0);

        // 만약에 플레이어1의 하트 또는 플레이어2의 하트가 0보다 크면 계속 진행
            while(player[0].heart>0 || player[1].heart>0) {
                for(int k=0; k<2; k++) {
                    if (player[k].score >= 3) {
                        break;
                    } else {
                        // shell 3개 만든다
                        int[] shell = new int[3];

                        // 섞기
                        for (int i = 0; i < 3; i++) {

                            // 중복제거해서 shell 나열하기
                            shell[i] = (int) (Math.random() * 3) + 1;
                            for (int j = 0; j < i; j++) {
                                if (shell[i] == shell[j]) {
                                    i--;
                                }
                            }
                        }

                        // player가 shell 고르기
                        System.out.println("<Player" + player[k].playerNum +"님 차례>");
                        System.out.println("다음 숫자 중 하나를 고르시오.");
                        for (int i = 0; i < 3; i++) {
                            System.out.print(shell[i] + " ");
                        }

                        // player가 하나를 고른다. player가 고른 숫자는 pick
                        Scanner sc = new Scanner(System.in);
                        Integer pick = 0;
                        pick = sc.nextInt();
                        pick = pick - 1;

                        // player가 123 중 숫자 i를 고르면 shell[i]를 고르는 것, shell 안에 있는 수는 랜덤하다
                        if (shell[pick] == 1) {
                            player[k].correct();
                        } else if (shell[pick] == 2) {
                            player[k].boom();
                        } else if (shell[pick] == 3) {
                            player[k].bang2();
                            player[k].bang();
                        } else {
                            System.out.println("오류입니다.");
                        }

                    }
                }

            }

    }

}

