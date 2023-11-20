package day01;

public class Ex03 {
    public static void main(String[] args) {
        // 1. 다음과 같이 정사각형을 출력하는 코드 작성
        /*
        ----------
         *****
         *****
         *****
         *****
         *****
        ----------
         */

        for(Integer i=0; i < 5; i=i+1) {
            System.out.println("*****");
        }

        System.out.println();

        // 2. 다음과 같이 삼각형을 출력하는 코드 작성
        /*
        ----------
         *
         **
         ***
         ****
         *****
        ----------
         */
        for(Integer i=0; i < 5; i=i+1) {
            for(Integer j=0; j <= i; j=j+1) {
                System.out.print("*");
            }
            System.out.println();
        }

        // 3. 다음과 같이 삼각형을 출력하는 코드 작성
        /*
        ----------
             *
            ***
           *****
          ********
         **********
         ----------
         */



    }
}
