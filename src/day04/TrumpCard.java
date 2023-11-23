package day04;

public class TrumpCard {
    // 카드 52장
    // 카드 클래스
    // 숫자 1~10 j=11 q=12 k=13
    // 모양 하트, 다이아, 클로버, 스페이드
    // 가로길이 세로길이
    private Integer cardNum;
    private String cardType;
    private static Integer width;
    private static Integer height;

    @Override
    public String toString() {
        return "Card{" +
                "num=" + cardNum +
                ", shape='" + cardType + '\'' +
                ", width='" + width + '\'' +
                ", height='" + height + '\'' +
                '}';
    }

    public TrumpCard(Integer cardNum, String cardType, Integer width, Integer height) {
        this.cardNum = cardNum;
        this.cardType = cardType;
        this.width = width;
        this.height = height;
    }


}
