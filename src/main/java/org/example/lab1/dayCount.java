package org.example.lab1;

import java.util.Scanner;

//public class dayCount {
//    public static void main(String[] args) {
//        int monthDay[] = {31,28,31,30,31, 30,31,31,30,31,30,31};
//        Scanner s= new Scanner(System.in);
//        int month = s.nextInt();
//        int day = s.nextInt();
//        int mday =0 ;
//        switch(month){
//            case 1 : mday = 0; break;
//            case 2 : mday = 28; break;
//            case 3 : mday = 31+28;break;
//            case 4 : mday = 31+31+28;break;
//            case 5 : mday = 30+31+28+31;break;
//            case 6 : mday = 31+30+31+28+31;break;
//
//            case 7 : mday = 30+31+30+31+28+31;break;
//            case 8 : mday = 31+30+31+30+31+28+31;break;
//            case 9 : mday = 31+31+30+31+30+31+28+31;break;
//            case 10 : mday = 30+31+31+30+31+30+31+28+31;break;
//            case 11 : mday = 31+30+31+31+30+31+30+31+28+31;break;
//            case 12: mday = 30+31+30+31+31+30+31+30+31+28+31;break;
//        }
//        System.out.println("result : " + (mday + day) );
//    }
public class dayCount {
    public static void main(String[] args) {
        dayCount pStudio = new dayCount();
        pStudio.Java05();
    }


    void Java05(){

        Scanner sc = new Scanner(System.in);
        int month = sc.nextInt();
        int day = sc.nextInt();


        System.out.println(daycount(day, month));

    }

    int daycount(int day,int month){

        int[] daysInMonth = { 0, 31, 59, 90, 120, 151, 181, 212, 243, 273, 304, 334 };

        int day_count = daysInMonth[month - 1] + day;


        return day_count;
    }

}
//}
