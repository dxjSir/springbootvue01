package springbootvue01.demo.bean;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.Date;

public class Book {

    private int id;
    private String bookName;

//    @JsonIgnore  // 这个注解可以省略这个字段
    private String bookauther;

//    @JsonFormat(pattern = "yyyy-MM-dd")  //格式化
    private Date date;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getBookauther() {
        return bookauther;
    }

    public void setBookauther(String bookauther) {
        this.bookauther = bookauther;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
