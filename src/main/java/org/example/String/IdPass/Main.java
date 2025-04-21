package org.example.String.IdPass;

import org.example.String.IdPass.vo.OutputIdPassword;

import java.util.Scanner;

public class Main {
    void run(){
        Scanner s= new Scanner(System.in);
        String userId = s.nextLine();
        String userPw= s.nextLine();
        if(userPw.length() <3 ){
            System.out.println("Error!");
            return;
        }
        String name = s.nextLine();
        OutputIdPassword app = new OutputIdPassword(userId,userPw,name);
        app.printInfo();
    }

    public static void main(String[] args) {
        Main main = new Main();
        main.run();
    }
}
