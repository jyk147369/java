package day01;

public class Ex04 {
    public static void main(String[] args) {
        // 1은 가위, 2는 바위, 3은 보
        
        // Player는 이름이 있고 가위 바위 보 중 하나를 저장할 수 있다.

        Player player01;
        player01 = new Player();
        player01.name = "철수";
        player01.num = (int)(Math.random()*3)+1;

        Player player02;
        player02 = new Player();
        player02.name = "영희";
        player02.num = (int)(Math.random()*3)+1;

        // player01이 가위, 바위, 보 중 랜덤하게 하나를 선택

        System.out.print(player01.name+"는 ");
        if (player01.num==1) {
            System.out.println("가위입니다.");
        } else if (player01.num==2) {
            System.out.println("바위입니다.");
        } else {
            System.out.println("보입니다.");}

        // player02가 가위, 바위, 보 중 랜덤하게 하나를 선택

        System.out.print(player02.name+"는 ");
        if (player02.num==1) {
            System.out.println("가위입니다.");
        } else if (player02.num==2) {
            System.out.println("바위입니다.");
        } else {
            System.out.println("보입니다.");}

        // 둘 중에 이긴 사람 출력, 무승부면 계속 반복
        // 1=가위 2=바위 3=보
        // 1,2면 2승, 2,3면 3승 1,3면 1승

        if (player01.num == player02.num) {
            System.out.println("무승부");
            while (player01.num==player02.num){
            }
        } else if (player01.num == 1 && player02.num == 2 || player01.num == 2 && player02.num == 3 || player01.num == 3 && player02.num == 1) {
            System.out.println(player02.name+"가 이겼습니다.");
        } else {
            System.out.println(player01.name+"가 이겼습니다.");}


    }








    }
