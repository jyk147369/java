package day01;

public class Practice {
    public static void main(String[] args) {
        // 강지흔 학생의 객체를 생성해서 저장한다.
        // 강지흔 학생의 객체의 나이에 26를 저장한다.
        // 강지흔 학생의 객체의 이름에 "강지흔"을 저장한다.
        Student kjh;
        kjh = new Student();
        kjh.age = 26;
        kjh.name = "강지흔";

        // 한경훈 학생의 객체를 생성해서 저장한다.
        // 한경훈 학생의 객체의 나이에 25를 저장한다.
        // 한경훈 학생의 객체의 이름에 "한경훈"을 저장한다.
        Student hkh = new Student(); // 객체 생성 후 바로 저장
        hkh.age = 25;
        hkh.name = "한경훈";

        // 임태우 학생의 객체를 생성해서 저장한다.
        // 임태우 학생의 객체의 나이에 27를 저장한다.
        // 임태우 학생의 객체의 이름에 "임태우"을 저장한다.
        Student ltw;
        ltw = new Student();
        ltw.age = 27;
        ltw.name = "임태우";

        // 이주현 학생의 객체를 생성해서 저장한다.
        // 이주현 학생의 객체의 나이에 23를 저장한다.
        // 이주현 학생의 객체의 이름에 "이주현"을 저장한다.
        Student ljh;
        ljh = new Student();
        ljh.age = 23;
        ljh.name = "이주현";

        // 강지흔 학생의 나이와 한경훈 학생의 나이를 곱해서 저장한다.
        // 임태우 학생의 나이와 이주현 학생의 나이를 더해서 저장한다.
        // 임태우 학생의 나이와 이주현 학생의 나이를 더해서 저장한 값에 강지흔 학생의 나이를 곱해서 저장한다.
        // 임태우 학생의 나이와 이주현 학생의 나이를 더해서 저장한 값에 강지흔 학생의 나이를 곱해서 저장한 값에 한경훈 학생의 나이를 나눈다.
        Integer result1;
        result1 = kjh.age * hkh.age;

        Integer result2;
        result2 = ltw.age + ljh.age;

        Integer result3;
        result3 = result2 * kjh.age;

        Integer result4;
        result4 = result3 / hkh.age;

        // 강지흔 학생의 나이와 한경훈 학생의 나이를 곱해서 저장한 값이
        // 임태우 학생의 나이와 이주현 학생의 나이를 더해서 저장한 값에 강지흔 학생의 나이를 곱해서 저장한 값에 한경훈 학생의 나이를 나눈 값보다
        // 큰지 비교한다.
        Boolean result5;
        result5 = result1 > result4;

        // 결과를 화면에 출력한다.
        System.out.println(result5);
    }
}
