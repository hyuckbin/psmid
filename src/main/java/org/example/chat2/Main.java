package org.example.chat2;

import org.example.chat2.vo.BookManager;

import java.util.Scanner;

public class Main {
    void run(){
        System.out.println("===Book Manager===");
        Scanner s = new Scanner(System.in);
        BookManager app = new BookManager();
        boolean quit = false;
        do{
            System.out.print("기능을 선택하세요 : ");
            String line = s.nextLine();
            String choice = line.split(" ")[0];

            switch (choice) {
                case "add":{
                    app.addBook();
                    break;
            }
                case "del" : {
                    app.deleteBook();
                    break;
                }
                case "edit" : {
                    app.updateBook();
                    break;
                }
                case "ls" : {
                    app.listBook();
                    break;
                }

                case "quit": {
                    quit = true;
                    break;
                }
            }
            }while(!quit);


    }
    public static void main(String[] args) {

        Main main = new Main();
        main.run();
    }
}
