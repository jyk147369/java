package day03;

public class Student {

    String name;
    Integer age;
    String gender;
    Integer fullness;
    Integer intelligence;

    // 밥먹기
    Integer eating(String menu, Integer amount) {
        fullness = fullness + amount;

        return fullness;

    }

    // 공부하기
    Integer studying (String subject, Integer time) {
        intelligence = intelligence + 2*time;

        return intelligence;

    }

    // 집에 가기
    void goHome(){
        System.out.println("집에 감");
    }
}
