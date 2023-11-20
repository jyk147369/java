package day01;

public class ForWhilePractice {
    public static void main(String[] args) {
        Integer num1;
        num1 = 10;

        // 만약에 num1이 5보다 크면
        // "크다"를 출력하는 걸 반복한다.
        while(num1 > 5){
            System.out.println("크다.");
            // 조건을 변경시키는 코드
            num1 = num1 - 1;
            System.out.println(num1);
        }

        // i가 0부터 i에 1 더하고 저장하면서 10보다 작으면
        // 반복할 코드를 반복한다.
        for(Integer i=0; i < 10; i=i+1) {
            System.out.println("반복할 코드");
        }
    }
}
