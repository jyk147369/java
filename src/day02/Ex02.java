package day02;

public class Ex02 {
    public static void main(String[] args) {
        // 총합을 저장하기 위한 변수 만들고 0으로 초기화
        int total = 0;
        // i가 1부터 100까지 1씩 증가하면서 반복
        for(int i=1; i < 101; i++) {
            //      만약에 i가 홀수면
            if(i%2==1){
                //          총합에 i를 더해서 저장
                System.out.println(i);
                total = total + i;
            }
        }

        System.out.println(total);

    }
}
