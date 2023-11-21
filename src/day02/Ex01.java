package day02;

public class Ex01 {
    public static void main(String[] args) {
        // 총합을 저장하기 위한 변수만들기
        int total = 0;

        // i가 1부터 100까지 1씩 증가하면서 반복
        //      총합에 1을 더해서 저장
        for(int i=0; i < 101; i++) {
            total = total + i;
        }
        System.out.println(total);





    }
}