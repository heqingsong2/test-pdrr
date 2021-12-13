package com.example.testpdrr.controller;

import com.example.testpdrr.mapper.UserMapper;
import com.hqs.pojo.BolgDetail;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class PdrController {

    @Resource
    UserMapper userMapper;

    @RequestMapping("/p1")
    public String p1(){
        System.out.println("pdr......");

        return "p1";
    }
    @RequestMapping("/list")
    public List<BolgDetail> list(){
        return userMapper.selectAll();
    }
}
