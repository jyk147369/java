package day02;

// 로또 번호 생성기 만들기
// 로또 번호는 1~45 중 중복이 없이 6개를 고르는 것
// 변수, 조건문, 반복문, 배열만 사용할 것, 랜덤 숫자 생성
public class Ex09 {
    public static void main(String[] args) {
        // 로또번호자동 생성기
        // 1부터 45까지의 숫자 중에서 중복 없이 6개의 숫자를 랜덤하게 생성
        int lotto [] = new int[6];
        for(int i = 0; i < lotto.length; i++){
            lotto[i] = (int)(Math.random()*45) + 1;
        }

        boolean flag = true;
        while(flag) {
            flag = false;
            for (int i = 0; i < 6; i++) {
                for (int j = i + 1; j < 6; j++) {
                    if (lotto[i] == lotto[j]) {
                        lotto[i] = (int) (Math.random() * 45) + 1;
                        i = 0;
                        flag = true;
                    }
                }
            }
        }

        for (int i = 0; i < 6; i++) {
            System.out.print(" " + lotto[i]);
        }

    }
}


