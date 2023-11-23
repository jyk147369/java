package day03;

public class PocketmonGo {
    public static void main(String[] args) {
        Pocketmon pikachu = new Pocketmon(
                "피카츄",
                10,
                100,
                1,
                0,
                "전기포켓몬",
                0,
                0
        );

        Pocketmon raichu = new Pocketmon(
                "라이츄",
                20,
                150,
                1,
                0,
                "전기포켓몬",
                0,
                0
        );

        Pocketmon charmander = new Pocketmon(
                "파이리",
                10,
                100,
                1,
                0,
                "불포켓몬",
                0,
                0
        );

        Pocketmon squirtle = new Pocketmon(
                "꼬부기",
                10,
                100,
                1,
                0,
                "물포켓몬",
                0,
                0
        );

        Pocketmon butterfree = new Pocketmon(
                "버터플",
                10,
                100,
                1,
                0,
                "공중포켓몬",
                0,
                0
        );

        Pocketmon slowbro = new Pocketmon(
                "야도란",
                10,
                100,
                1,
                0,
                "물포켓몬",
                0,
                0
        );

        Pocketmon pidgeot = new Pocketmon(
                "피존투",
                10,
                100,
                1,
                0,
                "공중포켓몬",
                0,
                0
        );

        Pocketmon koffing = new Pocketmon(
                "도가스",
                10,
                100,
                1,
                0,
                "독포켓몬",
                0,
                0
        );

        // System.out.println(pikachu.hp);
        // 변수 hp에 private을 달아놨기때문에 에러남

        System.out.println(pikachu.getHp());
        // 따라서 hp 리턴하는 메소드 만들어서 출력

    }
}
