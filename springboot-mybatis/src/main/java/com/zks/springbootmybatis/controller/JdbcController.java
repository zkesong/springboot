package com.zks.springbootmybatis.controller;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author KeSong Zeng
 * @version V1.0
 * @e-mail kesongzeng@163.com
 * @date 2018/3/9 16:50
 * @Description:
 */
@RestController
public class JdbcController {

    @Autowired
    private SqlSession sqlSession;

    @RequestMapping("getAll")
    public String connect() {

        return "success" + sqlSession.
                selectOne("com.zks.springbootmybatis.dao.CityMapper.getAll");
    }

}
