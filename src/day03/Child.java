package day03;

public class Child extends Parents{
    String car;

    @Override
    void shopping(String item) {
        super.shopping(item);
        money = money * 2;
    }

    public Child(String car) {
        this.car = car;

        // 오버로딩
        // 하나의 클래스에서 같은 이름의 메소드를 만드는 것

        // 오버라이딩
        // 부모가 상속해준 메소드를 내가 바꿔서 사용
        // 선언부가 같아야 함
        // 두개의 클래스에서 같은 메소드를 만드는 것
        // 자식이 부모의 메소드에 덮어쓴다 -> overwrite
        // Ctrl + o 누르면 오버라이딩 할 수 있는 메소드가 표시됨





        }
    }
