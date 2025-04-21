package org.example.lab1;

import java.util.Scanner;

//좌표 2개를 입력받아 거리 계산
//pow = (a,b) => a의 b제곱 , sqrt =(25) 5 -> 제곱근
public class J004 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double x1 = s.nextDouble();
        double y1 = s.nextDouble();
        double x2 = s.nextDouble();
        double y2 = s.nextDouble();

        System.out.println(Math.sqrt(Math.pow(x2-x1,2)+Math.pow(y2-y1,2)) );

    }

}
