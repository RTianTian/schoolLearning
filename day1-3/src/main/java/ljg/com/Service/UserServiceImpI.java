package ljg.com.Service;

import ljg.com.Dao.UserDao;

public class UserServiceImpI implements UserService {
    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public void add() {
        userDao.add();
    }

    public void del() {
userDao.del();
    }

    public void update() {
        userDao.update();

    }

    public void findById(int id) {
userDao.findById(id);
    }
}
