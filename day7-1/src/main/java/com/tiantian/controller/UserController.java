package com.tiantian.controller;

import com.tiantian.Service.UserService;
import com.tiantian.pojo.User;
import org.springframework.stereotype.Controller;

import java.util.ArrayList;

@Controller(value = "controller")
public class UserController {
    private UserService userService;
//<!--property:它是bean标记的子标记,
//用以调用Bean实例中的相关Set方法完成属性值的赋值,
//从而完成依赖关系的注入-->
    public void setUserService(UserService userService) {
        this.userService = userService;
    }
    public void add(){
        User user = new User(666,"天天",21,"女","北京");
        userService.addUser(user);
    }
    public void update(){
        User user = new User(888,"天天",21,"女","北京");
        userService.updateUser(user);
    }
    public void del(){
        User user = new User(888,"天天",21,"女","北京");
        userService.delUser(user);
    }

    public void findby(){
        System.out.println(userService.findbyName("111").toString());

    }
    public void findall(){
        User user = new User(888,"天天",21,"女","北京");
        for (User user2:userService.findAll(user)){
            System.out.println(user2.toString());
        }

    }

    }
