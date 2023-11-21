package day02;

import java.util.Scanner;

public class 입력받기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("글자 입력하세요: ");
        String inputStr = sc.nextLine();
        System.out.println(inputStr);
        System.out.print("숫자 입력하세요: ");
        int inputNum =  sc.nextInt();
        System.out.println( inputNum);
    }
}
