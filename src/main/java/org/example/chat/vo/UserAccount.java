package org.example.chat.vo;

import java.util.Random;
import java.util.Scanner;

public class UserAccount {
    private String id;
    private String encodePw;
    private int randVal;
    int[] scores ;
    Scanner s= new Scanner(System.in);

    public UserAccount(String id , String pw){
        Random rand = new Random();
        randVal = rand.nextInt(9000) +1000;
        int inPw= Integer.parseInt(pw) + randVal;
        this.encodePw = String.valueOf(inPw);
        this.id = id;
        scores = new int[3];
    }

    public boolean checkLogin(String id, String pw){
        int userEncode = Integer.parseInt(pw) + randVal;
        pw = String.valueOf(userEncode);
        if(this.id.equals(id) &&this.encodePw.equals(pw)){
            return true;
        }
        return false;
        }

    public void setScore(){
        System.out.print("국어 점수 : ");
        scores[0] = s.nextInt();
        System.out.print("영어 점수 : ");
        scores[1] = s.nextInt();
        System.out.print("수학 점수 : ");
        scores[2] = s.nextInt();
    }
    public void printScore(){
        int sumScore = scores[0]+scores[1]+scores[2];
        double avgScore = sumScore / 3.0;

        System.out.printf("국어: %d 영어 : %d 수학 : %d\n",scores[0],scores[1],scores[2]);
        System.out.printf("총점 : %d , 평균 %.1f",sumScore ,avgScore);
    }

    public String decodePw(){
        int incodePw = Integer.parseInt(encodePw) -randVal;
        String firstPw = String.valueOf(incodePw);
        return firstPw;
    }

    public String encodePw(){
        return encodePw;
    }
}



