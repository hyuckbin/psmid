package org.example.lav5.vo;

import java.util.ArrayList;
import java.util.Scanner;

public class TodoCRUD implements ICRUD{
    ArrayList<TodoItem> list = new ArrayList<>();
    Scanner s = new Scanner(System.in);

    @Override
    public void addList() {
        System.out.print("Input the title: ");
        String title = s.nextLine();

        System.out.print("Input the detail");
        String detatil = s.nextLine();

        TodoItem todoitem = new TodoItem(title,detatil);

        list.add(todoitem);

        System.out.println("item added!");
        return;

    }

    @Override
    public void updateList() {
        System.out.println("Enter the edit Title ");
        String update = s.nextLine().trim();

        TodoItem editItem = null;

        for(TodoItem to : list){
            if(update.equals(to.getTitle())){
                editItem = to;
             break;
            }
        }

        if(editItem == null){
            System.out.println("no data");
            return;
        }
        System.out.println(editItem.toString());
        System.out.print("Input the detail : ");
        String newDetail = s.nextLine().trim();

        editItem.setDetail(newDetail);
        System.out.println("Complete update");
        return;
    }

    @Override
    public void deleteList() {
        System.out.println("Enter the delete Title ");
        String delete = s.nextLine().trim();

        TodoItem deleteItem = null;

        for(TodoItem to : list){
            if(delete.equals(to.getTitle())) {
                deleteItem = to;
                break;
            }
        }

        if(deleteItem == null){
            System.out.println("no data");
            return;
        }

        list.remove(deleteItem);
        System.out.println("delete complete!");
    }

    @Override
    public void printList() {
        System.out.println("Total "+list.size() + " items");
        for(TodoItem todo : list){
            System.out.println(todo);
        }
    }
}
