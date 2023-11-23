package day02;

public class Ex08 {
    public static void main(String[] args) {
        // 로또 번호 생성기 만들기
        // 로또 번호는 1~45 중 중복이 없이 6개를 고르는것
        // 변수, 조건문, 반복문, 배열만 사용할 것, 랜덤 숫자 생성
        // 로또번호 자동 생성기
        // 1부터 45까지의 숫자 중에서 중복없이 6개의 숫자를 랜덤하게 생성

        // 숫자를 입력받을 크기가 6인 배열 만들기
        int[] num = new int[6];

        // 숫자 랜덤 뽑기

        for (int i = 0; i < 6; i++) {
            num[i] = (int) (Math.random() * 6) + 1;
            // 중복 제거
        for (int j = 0; j < i; j++) {
                if(num[i]==num[j]){
                    i --;
                }
            }

        }

        for(int i=0; i<6; i++) {

            System.out.println(num[i]);

        }




    }
}


// num[0], num[1], num[2], num[3], num[4], num[5] 뽑힘
// num[0]이랑 num[1], num[2], num[3], num[4], num[5] 같은지 확인
// num[1]이랑 num[2], num[3], num[4], num[5] 같은지 확인
// num[2]이랑 num[3], num[4], num[5] 같은지 확인
// num[3]이랑 num[4], num[5] 같은지 확인
// num[4]이랑 num[5] 같은지 확인
// 같다면 num[4]이랑 num[0], num[1], num[2], num[3], num[4], num[5]
