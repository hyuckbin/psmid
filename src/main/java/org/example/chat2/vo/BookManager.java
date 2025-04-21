package org.example.chat2.vo;

import java.util.ArrayList;
import java.util.Scanner;

public class BookManager implements ICRUD {
    ArrayList <Book> list = new ArrayList <>();
    Scanner s = new Scanner(System.in);

    @Override
    public void addBook() {
        System.out.print("책 제목: ");
        String title = s.nextLine().trim();
        if(!isDuplicated(title)) {
            System.out.println("제목이 중복되었습니다!");
            return;
        }

        System.out.print("저자 : ");
        String author = s.nextLine().trim();

        // 숫자 자리에 문자열이 들어온다면
        System.out.print("발행년도 : ");
        int year;

        try {
             year = Integer.parseInt(s.nextLine());
        } catch(NumberFormatException e){
            System.out.println("숫자를 입력하세요");
            return;
        }

        Book app = new Book(title,author,year);

        list.add(app);

        System.out.println("added item!");
    }

    boolean isDuplicated(String title){
        for(Book bk : list) {
            if(title.equals(bk.getTitle())){
                return false;
        }
        }
        return true;
    }

    @Override
    public void updateBook() {
        System.out.print("수정할 책의 제목 : ");
        String editTitle = s.nextLine().trim();

        Book edit = null;

        for(Book b : list){
            if(editTitle.equals(b.getTitle())){
                edit = b;
                break;
            }
        }
        if(edit == null){
            System.out.println("수정할 책이 없습니다.");
            return;
        }

        System.out.println("수정할 저자 : ");
        String editAuthor = s.nextLine().trim();
        System.out.println("수정할 출판연도 : ");
        int editYear = Integer.parseInt(s.nextLine());

        edit.setAuthor(editAuthor);
        edit.setYear(editYear);

        System.out.println("수정완료!");

    }

    @Override
    public void listBook() {
        if(list.isEmpty()){
            System.out.println("등록된 책이 없습니다");
            return ;
        }
        for(Book i : list){
            System.out.println(i);
        }
    }

    @Override
    public void deleteBook() {

        System.out.print("삭제할 책의 제목 : ");
        String delTitle = s.nextLine().trim();

        Book del = null;

        for(Book b : list){
            if(delTitle.equals(b.getTitle())){
                del = b;
                break;
            }
        }
        if(del == null){
            System.out.println("삭제할 책이 없습니다.");
            return;
        }

        list.remove(del);

        System.out.println("삭제완료!");


    }
}
