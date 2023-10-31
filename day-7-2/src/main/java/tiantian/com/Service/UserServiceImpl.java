package tiantian.com.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tiantian.com.dao.UserDao;
import tiantian.com.pojo.User;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;

    public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }


    public void addUser(User user) {
        userDao.addUser(user);
    }

    public void delUser(int id) {
    userDao.delUser(id);
    }

    public void updateUser(User user) {
        userDao.updateUser(user);
}

    public User findbyid(int id) {
        return userDao.findbyid(id);
    }

    public List<User> findAll() {
        return userDao.findAll();
    }
}
