package ljg.com.service;

import ljg.com.dao.UserDao;
import ljg.com.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service //此注解用于service层
public class UserServiceImpl implements UserService{
    @Autowired
    private UserDao userDao;

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

    public List<User> findALL() {
        return userDao.findALL();
    }
}
