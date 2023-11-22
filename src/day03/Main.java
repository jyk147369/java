package day03;

public class Main {
    public static void main(String[] args) {
        Student yhs;
        yhs = new Student();

        yhs.name = "양호신";
        yhs.age = 25;
        yhs.gender = "남자";
        yhs.fullness = 50;
        yhs.intelligence = 10;

        // 밥먹기
        // Integer eating(String menu, Integer amount) {
        //     fullness = fullness + amount;

        //     return fullness;
        //     }
        // 위의 밥먹기 메소드를 사용할거다
        Integer result1 = yhs.eating("도시락", 40);    // 메소드를 사용해서 fullness는 90이 됨

        // 공부하기
        // Integer studying (String subject, Integer time) {
        //     intelligence = intelligence + 2*time;

        //     return intelligence;
        // }
        // 위의 공부하기 메소드를 사용
        Integer relsult2 = yhs.studying("자료 구조", 4);   // 메소드를 사용해서 intelligence는 18이 됨

        yhs.goHome();

    }
}
