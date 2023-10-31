package com.tiantian.Service;

import com.tiantian.pojo.User;
import org.springframework.stereotype.Service;

import java.util.List;
public interface UserService {

        public void addUser(User user);

        public void delUser(User user);

        public void updateUser(User user);

        public User findbyName(String name);

        public List<User> findAll(User user);


    }

