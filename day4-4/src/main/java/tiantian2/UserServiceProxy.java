package tiantian2;

public class UserServiceProxy implements UserService {
//    在代理中将UserService接口中的方法调用过来
    private UserServiceImpl userService;

// 此处不使用构造器了，使用set方法，来调用这个类
    public void setUserService(UserServiceImpl userService) {
        this.userService = userService;
    }

    public void add() {
        log("add");
        userService.add();

    }

    public void delete() {
        log("delete");
        userService.delete();

    }

    public void update() {
        log("update");
        userService.update();
    }

    public void find() {
        log("find");
        userService.find();
    }
//
    public void log(String msg){
        System.out.println("调用了"+msg+"的方法");
    }
}
