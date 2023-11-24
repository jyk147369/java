package day04;

import java.util.Scanner;

public class Car {
    String carName;
    // 이동할 거리
    Integer carX;
    // 4이상일 때만 x만큼 이동
    Integer randomNum;
    Integer movingNum;

    public Car(String carName, Integer carX) {
        this.carName = carName;
        this.carX = 0;
    }

    // 전진한다
    Integer moving(){
        System.out.println("<"+this.carName+"의 순서>");
        this.randomNum = (int) (Math.random() * 9);
        System.out.println("뽑은 숫자는 " + this.randomNum + "입니다.");
        if(this.randomNum>=4){
            this.carX = this.carX + 1;
            System.out.println("앞으로 " + 1 + "만큼 전진합니다.");
            System.out.println("현재 "+this.carName+"의 위치 : "+this.carX);
        } else {
            this.carX = this.carX + 0;
            System.out.println("아무 일도 일어나지 않습니다.");
            System.out.println("현재 "+this.carName+"의 위치 : "+this.carX);
        }
        return carX;
    }

    void finalGoal(){
        System.out.println(this.carName+"의 최종위치 : "+this.carX);
    }


}
