package day01;

import java.util.Arrays;

class School {
    public static void main(String[] args) {
        // 클래스로 객체 생성
        // 객체를 저장할 수 있는 변수 생성
        Student kty;

        // 앞에서 만든 변수에 new로 객체를 생성해서 저장
        kty = new Student();

        // 객체 안에 있는 변수, 메소드를 사용할 때는 변수 이름 다음 . 사용
        kty.age = 26;
        kty.name = "김태윤";
        kty.major = true;

        Student yhd;
        yhd = new Student();

        yhd.age = 31;
        yhd.name = "유형도";

        Student kkm;
        kkm = new Student();
        kkm.age = 27;
        kkm.name = "김경미";
        kkm.major = false;

        Integer totalAge;
        totalAge = kty.age + yhd.age * kkm.age;

        Integer result;
        result = kty.age + yhd.age; // 57
        System.out.println(result); // sout = System.out.println()
        result = kty.age - yhd.age; // -4
        System.out.println(result);
        result = kty.age * yhd.age; // 806
        System.out.println(result);
        result = kty.age / yhd.age; // 0, 몫만 저장
        System.out.println(result);
        result = kty.age % yhd.age; // 26
        System.out.println(result);

        // 괄호 -> 산술 -> 비교 -> 논리 -> 대입

        Boolean result2;
        result2 = kty.age > yhd.age;
        System.out.println(result2);
        result2 = kty.age < yhd.age;
        System.out.println(result2);
        result2 = kty.age == yhd.age;
        System.out.println(result2);
        result2 = kty.age != yhd.age;
        System.out.println(result2);

        // 논리 연산자
        // 연산(&&)     결과
        //  f && f       f
        //  f && t       f
        //  t && f       f
        //  t && t       t
        // 곱셈같은 애

        // 연산(||)     결과
        //  f || f       f
        //  f || t       t
        //  t || f       t
        //  t || t       t
        // 덧셈같은 애

        Lesson linux;
        linux = new Lesson();
        linux.subject = "linux";
        linux.day = 2;

        Lesson db;
        db = new Lesson();
        db.subject = "Database";
        db.day = 8;

        Lesson softwareEngineering;
        softwareEngineering = new Lesson();
        softwareEngineering.subject = "SoftwareEngineering";
        softwareEngineering.day = 3;

    }
}
