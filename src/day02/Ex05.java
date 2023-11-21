package day02;

public class Ex05 {
    public static void main(String[] args) {
        // 숫자를 입력받을 크기가 10인 배열 만들기
        int[] num = new int[10];

        // 0부터 9까지 반복
        //      배열의 반복 횟수 번째에 1에서 10까지 범위의 정수를 랜덤한 숫자를 생성해서 저장
        for(int i=0; i < 10; i++){
            num[i]=(int)(Math.random()*10)+1;
            System.out.println(num[i]);
        }
        // 모든 수를 저장할 변수를 생성
        int sum = 0;
        // 0부터 9까지 반복
        //      모든 수를 저장할 변수에 반복 횟수에 해당하는 배열의 값을 더해서 저장
        for(int i=0; i < 10; i++){
            sum = sum + num[i];
        }

        // 모든 수를 저장한 변수를 출력
        System.out.println("랜던한 수의 총합: "+sum);

    }


}
