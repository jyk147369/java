package day01;

public class Ex04 {
    public static void main(String[] args) {
        // 1은 가위, 2는 바위, 3은 보
        
        // Player는 이름이 있고 가위 바위 보 중 하나를 저장할 수 있다.

        String Player01 = "철수";
        String Player02 = "영희";

        // player01이 가위, 바위, 보 중 랜덤하게 하나를 선택
        Integer num = (int)(Math.random()*3)+1;
        if (num==1) {
            System.out.println("가위입니다.");
        } else if (num==2) {
            System.out.println("바위입니다.");
        } else {
            System.out.println("보입니다.");
    }

    }

        // player02가 가위, 바위, 보 중 랜덤하게 하나를 선택
        
        // 둘 중에 이긴 사람 출력, 무승부면 계속 반복


    }
}
