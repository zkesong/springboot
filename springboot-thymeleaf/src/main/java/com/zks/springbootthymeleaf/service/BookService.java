package com.zks.springbootthymeleaf.service;


import com.zks.springbootthymeleaf.model.Book;

import java.util.List;

/**
 * @author KeSong Zeng
 * @version V1.0
 * @e-mail kesongzeng@163.com
 * @date 2018/3/12 16:32
 * @Description:
 */
public interface BookService {

    List<Book> getBooks();
}
