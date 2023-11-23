package day03;

public class Lol {
    public static void main(String[] args) {
        System.out.println("챔피언 객체 생성 전");
        Champion garen = new Champion(
                "가렌",
                72,
                100,
                580,
                60,
                1,
                0,
                0,
                0,
                new String[6]
        );
        System.out.println("챔피언 객체 생성 후");
        System.out.println(garen.hp);

        System.out.println("챔피언 객체 생성 전");
        Champion darius = new Champion(
                "다리우스",
                64,
                175,
                652,
                39,
                1,
                0,
                0,
                0,
                new String[6]
        );
        System.out.println("챔피언 객체 생성 후");
        System.out.println(darius.hp);

        // 다리우스가 가렌을 공격한다.
        // 현재 가렌의 체력 출력
        darius.attackTo(garen);
        System.out.println(garen.hp);

        // 다리우스가 가렌을 공격한다.
        // 현재 가렌의 레력 출력
        darius.attackTo(garen);
        System.out.println(garen.hp);

        // 다리우스가 가렌을 공격한다.
        // 현재 가렌의 체력 출력
        darius.attackTo(garen);
        System.out.println(garen.hp);

        System.out.println(darius.name + " " + darius.hp);

        System.out.println("toString : " + darius.toString());

        Champion jinx = new Champion("징크스");

        Champion katalina = new Champion(400);

        katalina.move(20,10);

        Tristana tristana =  new Tristana("트리스타나");
        tristana.move(10, 20);
        tristana.jump();


    }
}
