package org.example.lav5.vo;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TodoItem {
    private String title;
    private String detail;
    private Date reg_date;

    public TodoItem(String title, String detail) {
        this.title = title;
        this.detail = detail;
        this.reg_date = new Date();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }
    @Override
    public String toString() {
        return "[" + title +"] " + detail + "-" + new SimpleDateFormat("yyyy/MM/dd").format(reg_date);
    }
}
