package org.example.yalco;

public class pack {
    //자바에서 패키지 구조는 중요
    //패키지 참조할 때 / * --> 와일드카드
    //  java.lang 패키지에 속한 기본 라이브러리 클래스들

    public static void main(String[] args) {
        System.out.println("이 클래스들은 왜 임포트를 안 해도 될까요?");

        Object object = new Object();
        String str = new String("java.lang 패키지 소속이라 그럼");
        Integer integer;
        Math math;

        //  다른 패키지에 속한 기본 라이브러리 클래스들  - > import 필요
//        ArrayList arrayList;
//        Calendar calendar;
//        Optional optional;
//        Iterator iterator;
//        InputStream inputStream;
//        Serializable serializable;
//        Stream stream;
//        Button button;

    }

}
