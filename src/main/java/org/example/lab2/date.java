//package org.example.lab2;
//
//import java.util.Scanner;
//
//public class date {
//    Scanner s = new Scanner(System.in);
//    int[] monthdays = {31,28,31,30,31,30,31,31,30,31,30,31};
//    int month,day;
//    int day_count=0 ;
//
//    public date(int month ,int day){
//        this.month = month;
//        this.day = day;
//
//        calculate();
//
//    }
//    void calculate(){
//        if (month <1 || month>12){
//            System.out.println("rong date!");
//            System.exit(0);
//        }
//        if(monthdays[month-1] < day || day<0) {
//            System.out.println("rong date!");
//            System.exit(0);
//
//        }
//
//
//        int dayofmonth=0;
//
//        for(int i=0; i< month -1; i ++){
//            dayofmonth += monthdays[i];
//        }
//
//        day_count = dayofmonth + day;
//    }
//
//    public int DayCount(){
//        return day_count;
//    }
//
//
//
//
//package org.example.lab2;
//
//import java.util.Scanner;
//
//public class date {
//    Scanner s = new Scanner(System.in);
//    int[] monthdays = {31,28,31,30,31,30,31,31,30,31,30,31};
//    int month,day;
//    int day_count=0 ;
//
//    public date(int month ,int day){
//        this.month = month;
//        this.day = day;
//
//        calculate();
//
//    }
//    void calculate(){
//        if (month <1 || month>12){
//            System.out.println("rong date!");
//            System.exit(0);
//        }
//        if(monthdays[month-1] < day || day<0) {
//            System.out.println("rong date!");
//            System.exit(0);
//
//        }
//
//
//        int dayofmonth=0;
//
//        for(int i=0; i< month -1; i ++){
//            dayofmonth += monthdays[i];
//        }
//
//        day_count = dayofmonth + day;
//    }
//
//    public int DayCount(){
//        return day_count;
//    }
//
//
//
//
//}