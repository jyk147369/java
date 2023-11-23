package day04;

public class Singleton {
        private Singleton instance;

        // 생성자 메소드
        private Singleton() {

        }

        public Singleton getInstance() {
            if(instance == null){
                instance = new Singleton();
            }
            return instance;
        }

}
