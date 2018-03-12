package com.zks.springbootthymeleaf.controller;

import com.zks.springbootthymeleaf.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author KeSong Zeng
 * @version V1.0
 * @e-mail kesongzeng@163.com
 * @date 2018/3/12 16:29
 * @Description:
 */
@Controller
public class BookController {

    @Autowired
    private BookService bookService;

    @RequestMapping("books")
    public String getBooks(Model model){
        model.addAttribute("books", bookService.getBooks());
        return "books";
    }
}
