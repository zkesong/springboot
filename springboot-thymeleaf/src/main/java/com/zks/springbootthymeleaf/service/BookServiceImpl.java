package com.zks.springbootthymeleaf.service;

import com.zks.springbootthymeleaf.model.Book;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @author KeSong Zeng
 * @version V1.0
 * @e-mail kesongzeng@163.com
 * @date 2018/3/12 16:32
 * @Description:
 */
@Service
public class BookServiceImpl implements BookService {
    @Override
    public  List<Book> getBooks() {
        List<Book> bookList = new ArrayList<>();
        Book book = new Book();
        book.setName("java程序设计");
        book.setPrice(234.2);
        Short status = 1;
        book.setStatus(status);
        Book book2 = new Book();
        book2.setName("c++程序设计");
        book2.setPrice(43.5);
        status = 0;
        book2.setStatus(status);
        bookList.add(book);
        bookList.add(book2);
        return bookList;
    }
}
