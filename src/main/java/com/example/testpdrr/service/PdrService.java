package com.example.testpdrr.service;


import com.example.testpdrr.pojo.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PdrService {
    @RequestMapping("f1")
    void f(){
        System.out.println("pdr--f1");
    }

    @RequestMapping("f2")
    String f2(@RequestParam("i") int i){
        i*=3;
        return i+"";
    }

    @RequestMapping("f3")
    User f3(@RequestParam("id")int id, @RequestParam("name") String name){
        User user = new User();
        user.setName(name);
        user.setId(id);
        return user;
    }
}
