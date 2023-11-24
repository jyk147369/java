package day05;

import java.util.ArrayList;
import java.util.HashMap;

public class CollectionTest {
    public static void main(String[] args) {
        // 리스트

        // 나중에 문법 더 배우고 쓸 형태
        // List<Integer> integerList = new ArrayList<Integer>(); -> 인터저만 저장하겠다

        ArrayList arrayList = new ArrayList();

        // 리스트의 값을 추가하는 법
        arrayList.add("111");
        arrayList.add("222");
        arrayList.add("333");
        arrayList.add(444); // 서로 다른 타입도 하나의 리스트에 저장 가능. but 좋은 리스트가 아니다

        // 리스트에서 원하는 위치의 값 가져오는 법
        System.out.println(arrayList.get(0));

        System.out.println(arrayList);

        // 리스트에 원하는 위치에 추가하는 법
        arrayList.add(0, "000");

        arrayList.remove("222");
        System.out.println(arrayList);

        // 리스트에 원하는 값 찾아서 삭제. 여러개가 있으면 앞에서부터 찾아서 먼저 나오는 것만 삭제
        arrayList.remove("222");
        System.out.println(arrayList);

        // 인덱스로 찾아서 삭제할 수도 있다. 자바프로그램에서 오버로딩한거
        arrayList.remove(0);
        System.out.println(arrayList);



        // 맵

        // 나중에 문법 더 배우고 쓸 형태
        // HashMap<String, String> hashMap = new HashMap<String, String>();

        HashMap hashMap = new HashMap();

        // 맵에 값을 추가하는  법
        hashMap.put("키1","값1");
        hashMap.put("키2","값2");
        hashMap.put("키3","값3");

        System.out.println(hashMap);


        // 맵에서 원하는 위치의 값 가져오는 법
        System.out.println(hashMap.get("키1"));

        // 맵에서 삭제하는 법
        hashMap.remove("키1");

        // 해시맵 다시 출력
        System.out.println(hashMap);

        System.out.println();
    }
}
