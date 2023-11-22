package day02;

public class Ex10 {
    public static void main(String[] args) {
        int lotto [] = new int[45];
        for(int i = 0; i < lotto.length; i++){
            lotto[i] = i + 1;
        }
        for(int i = 0; i < 100; i++){
            int j = (int)(Math.random()*lotto.length);
            int std = lotto[0];
            lotto[0] = lotto[j];
            lotto[j] = std;
        }

        for (int i = 0; i < 6; i++){
            System.out.println(lotto[i] + " ");
        }

    }
}
