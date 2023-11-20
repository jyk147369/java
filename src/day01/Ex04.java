package day01;

public class Ex04 {
    public static void main(String[] args) {
        // 1은 가위, 2는 바위, 3은 보
        // Player는 이름이 있고 가위 바위 보 중 하나를 저장할 수 있다.

        Player player01;
        player01 = new Player();
        player01.name = "철수";

        Player player02;
        player02 = new Player();
        player02.name = "영희";

        // 무승부라면 다시 반복
        while(player01.num == player02.num) {

            // 다시 가위바위보
            player01.num = (int)(Math.random()*3)+1;
            player02.num = (int)(Math.random()*3)+1;

            // 철수 뭐냄?
            System.out.print(player01.name+"는 ");
            if (player01.num==1) {
                System.out.println("가위입니다.");
            } else if (player01.num==2) {
                System.out.println("바위입니다.");
            } else {
                System.out.println("보입니다.");}

            // 영희 뭐냄?
            System.out.print(player02.name+"는 ");
            if (player02.num==1) {
                System.out.println("가위입니다.");
            } else if (player02.num==2) {
                System.out.println("바위입니다.");
            } else {
                System.out.println("보입니다.");}

            // 승부는?
            if (player01.num == player02.num) {
                System.out.println("무승부");
            } else if (player01.num == 1 && player02.num == 2 || player01.num == 2 && player02.num == 3 || player01.num == 3 && player02.num == 1) {
                System.out.println(player02.name+"가 이겼습니다.");
            } else {
                System.out.println(player01.name+"가 이겼습니다.");}

        }


    }








    }
