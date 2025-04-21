package org.example.chat;

import org.example.chat.vo.UserAccount;

import java.util.Scanner;

 class Main {
    void run(){
        Scanner s= new Scanner(System.in);
        System.out.print("Input the id : ");
        String id = s.nextLine();
        System.out.print("Input the pw (6자리 이상) : ");
        String pw = s.nextLine();
        UserAccount user = new UserAccount(id,pw);

        boolean quit = false;
        while(!quit){
            System.out.print("id 입력하시오: ");
            String userId = s.nextLine();
            if(userId.equals("quit")) {
                System.out.println("종료합니다");
                quit = true;
                continue;
            }
            System.out.print("pw 입력하시오 : ");
            String userPw = s.nextLine();

            if(user.checkLogin(userId,userPw)){
                System.out.println("로그인 성공!");
                break;
            }
            else System.out.println("실패 다시 입력하세요,(quit):종료");

        }

        user.setScore();;
        user.printScore();
    }
    public static void main(String[] args) {
        Main main = new Main();
        main.run();
    }
}
