package day04;

import java.util.Scanner;

public class Player {
    // playerNum은 아이디같은거
    Integer playerNum;

    // player 하트
    Integer heart;

    // player 점수
    static Integer score;

    //player 생성자
    public Player(Integer playerNum, Integer heart, Integer score){
        this.playerNum = playerNum;
        this.heart = heart;
        this.score = score;
    }

    // shell 고르기
    void pickShell(){
        Scanner sc = new Scanner(System.in);
        Integer pick = 0;
        pick = sc.nextInt();
    }

    // shell 잘 잡았을까?


    // 정답 잡았을때
    Integer correct() {
        System.out.println("정답!");
        this.score = this.score + 1;
        if(score>=3) {
            System.out.println("이겼습니다!");
            System.out.println("게임 클리어!");
        }
        System.out.println("현재 " + "Player" + this.playerNum + "의 하트 : " + this.heart);
        System.out.println("현재 Player의 점수 : " + this.score);
        return score;
    }

    // 꽝 잡았을때
    Integer boom() {
        System.out.println("꽝!");
        this.heart = this.heart - 1;
        if(heart<=0) {
            System.out.println("사망했습니다.");
        }
        System.out.println("현재 " + "Player" + this.playerNum + "의 하트 : " + this.heart);
        System.out.println("현재 Player의 점수 : " + this.score);
        return heart;
    }

    // 폭탄 잡았을때
    Integer bang() {
        this.score = this.score - 1;
        if(score<=0) {
            this.score = 0;
        }
        System.out.println("현재 Player의 점수 : " + this.score);
        return score;
    }

    Integer bang2() {
        System.out.println("폭탄!");
        this.heart = this.heart - 1;
        if(heart<=0) {
            System.out.println("사망했습니다.");
        }
        System.out.println("현재 " + "Player" + this.playerNum + "의 하트 : " + this.heart);
        return heart;
    }




}
