package org.example.lav5;

import org.example.lav5.vo.TodoCRUD;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.run();

    }

    void run(){
        Scanner s = new Scanner(System.in);

        TodoCRUD app = new TodoCRUD();
        boolean quit = false;

        do{
            System.out.println("what?");
            String chocie = s.nextLine().trim();
            switch (chocie){
                case "add" :  app.addList(); break;
                case "ls"  : app.printList(); break;
                case "edit" : app.updateList(); break;
                case "del" : app.deleteList(); break;
                case "exit" :
                    System.out.println("end~!");
                    quit = true; break;
            }
        }while(!quit) ;

    }
}
