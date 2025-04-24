package org.example.yalco.frameWork;

import java.util.ArrayList;

public class list {
    //  ⭐️ 제네릭을 사용하여 타입 지정
    //  - 붙이지 않을 시 <Object>와 동일
    ArrayList<Integer> ints1 = new ArrayList<>();
    ArrayList<String> strings = new ArrayList<>();
    ArrayList<Number> numbers = new ArrayList<>();
    ArrayList<Knight> knights = new ArrayList<>();

    //  💡 다른 Collection 인스턴스를 사용하여 생성
    ArrayList<Integer> ints3 = new ArrayList<>(ints1);

    //  스스로를 복제하여 반환 (⚠️ 얕은 복사)
    ArrayList<Integer> ints4 = (ArrayList<Integer>) ints3.clone();
    G
}
