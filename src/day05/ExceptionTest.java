package day05;

public class ExceptionTest {

    // 메소드만든 클래스에서 메소드에 예외를 던져준다
    // 레포지터리
    int method01(int num1, int num2) throws ArithmeticException, IndexOutOfBoundsException {
        int result = 0;
        int[] arr = new int[3];

        // 내가 맨날 배열 인덱스 0부터 시작인거 까먹고 실행했을때 뜨는 에러가 이거였군...
        //arr[5] = 10;

        // 한번 나눠봐라
        result = num1 / num2;

        return result;
    }
}
