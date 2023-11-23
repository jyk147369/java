package day04;

public class Card {
    public static void main(String[] args) {
        TrumpCard heart01 = new TrumpCard(1, "하트", 150, 200);
        TrumpCard heart02 = new TrumpCard(2, "하트", 15, 20);

        System.out.println(heart01.toString());
        System.out.println(heart02.toString());

        // static은 마지막 값을 저장
    }


}
