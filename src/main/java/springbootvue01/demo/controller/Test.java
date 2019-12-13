package springbootvue01.demo.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import springbootvue01.demo.bean.Book;

import java.util.Date;

@RequestMapping("/test")
@RestController
public class Test {

    @RequestMapping("getJson")
    public Book getJson() {
        Book book = new Book();
        book.setId(1);
        book.setBookName("123");
        book.setBookauther("zh");
        book.setDate(new Date());
        return book;
    }

}
