package day03;

public class Lol {
    public static void main(String[] args) {
        Champion garen = new Champion();
        garen.name = "가렌";
        garen.lv = 1;
        garen.atk = 72;
        garen.range = 100;
        garen.def = 60;
        garen.exp = 0;
        garen.hp = 580;
        garen.x = 0;
        garen.y = 0;
        garen.itemList = new String [6];
        for (int i=0; i< garen.itemList.length; i++) {
            garen.itemList[i] = "빈칸";
        }

        Champion darius = new Champion();
        darius.name = "다리우스";
        darius.lv = 1;
        darius.atk = 64;
        darius.range = 175;
        darius.def = 39;
        darius.exp = 0;
        darius.hp = 652;
        darius.x = 0;
        darius.y = 0;
        darius.itemList = new String [6];
        for (int i=0; i< garen.itemList.length; i++) {
            darius.itemList[i] = "빈칸";
        }

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

    }
}
