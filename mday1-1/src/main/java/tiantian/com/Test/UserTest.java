package tiantian.com.Test;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.jupiter.api.Test;
import tiantian.com.Dao.UserDao;
import tiantian.com.pojo.User;

import java.io.IOException;
import java.io.InputStream;

public class UserTest {
    @Test
    public void add()throws IOException{
        /*
//        写出该文件的来源
            String resouce ="mybaits.xml";
            InputStream inputStream = Resources.getResourceAsStream(resouce);
//            创建一个SqlSessionFactory工厂
            SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
//打开该工厂的指令码
            SqlSession sqlSession = sqlSessionFactory.openSession();
            UserDao mapper = sqlSession.getMapper(UserDao.class);
            User user = new User(5002, "天天2", "女", 20, "河北");
            int i =mapper.addUser(user);
            if(i>0){
                sqlSession.commit();
                System.out.println("数据插入成功");
            }else {
                sqlSession.rollback();
                System.out.println("数据插入不成功");
            }
            */
        String resouce="mybaits.xml";
        InputStream stream = Resources.getResourceAsStream(resouce);
        SqlSessionFactory build = new SqlSessionFactoryBuilder().build(stream);
        SqlSession sqlSession = build.openSession();
        UserDao mapper = sqlSession.getMapper(UserDao.class);
        User user = new User(9,"天","女",21,"邯郸");
        int i=mapper.addUser(user);
        if (i>0){
            sqlSession.commit();
            System.out.println("数据插入成功");
        }else{
            sqlSession.rollback();
            System.out.println("数据插入失败");

        }
    }




        @Test
                public void update() throws IOException {
//        第一步：获取资源，配置和Dao层实现类
String resource  = "mybaits.xml";
//第二步：创建输入流对象
           InputStream inputStream =  Resources.getResourceAsStream(resource);
//            第三步：创建SqlSessionFactory工厂，用于处理sql语句的操作
            SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
//    第四步：创建sqlSession会话对象，完成sql语句的执行
            SqlSession sqlSession = sqlSessionFactory.openSession();
//            第五步：使用sqlSession 执行sql语句
            UserDao mapper = sqlSession.getMapper(UserDao.class);
//            第六步：编写SQL语句
            User user = new User(10, "往东", "男", 23, "河北");
//            第6.5步，先查询用户是否存在，再修改它的内容
           if(mapper.findbyid(10)!=null){
               int i =mapper.updateUser(user);
               System.out.println("存在此人，进行修改");
            if(i>0){
                sqlSession.commit();
                System.out.println("数据修改成功");
            }else {
                sqlSession.rollback();
                System.out.println("数据修改不成功");
            }
           }else {
               System.out.println("没有此人");
           }

        }
    @Test
    public void findbyid() throws IOException {
//        第一步：获取资源，配置和Dao层实现类
        String resource  = "mybaits.xml";
//第二步：创建输入流对象
        InputStream inputStream =  Resources.getResourceAsStream(resource);
//            第三步：创建SqlSessionFactory工厂，用于处理sql语句的操作
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
//    第四步：创建sqlSession会话对象，完成sql语句的执行
        SqlSession sqlSession = sqlSessionFactory.openSession();
//            第五步：使用sqlSession 执行sql语句
        UserDao mapper = sqlSession.getMapper(UserDao.class);

        User user =mapper.findbyid(10);
        if(user!=null){
            System.out.println(user.toString());
        }else {
            System.out.println("查无此人，请输入其他学号");
        }
    }
    @Test
    public void findall() throws IOException {
//        第一步：获取资源，配置和Dao层实现类
        String resource  = "mybaits.xml";
//第二步：创建输入流对象
        InputStream inputStream =  Resources.getResourceAsStream(resource);
//            第三步：创建SqlSessionFactory工厂，用于处理sql语句的操作
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
//    第四步：创建sqlSession会话对象，完成sql语句的执行
        SqlSession sqlSession = sqlSessionFactory.openSession();
//            第五步：使用sqlSession 执行sql语句
        UserDao mapper = sqlSession.getMapper(UserDao.class);
       for (User user :mapper.findAll()){
           System.out.println(user.toString());
       }
    }
    @Test
    public void delUser() throws IOException {
//        第一步：获取资源，配置和Dao层实现类
        String resource  = "mybaits.xml";
//第二步：创建输入流对象
        InputStream inputStream =  Resources.getResourceAsStream(resource);
//            第三步：创建SqlSessionFactory工厂，用于处理sql语句的操作
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
//    第四步：创建sqlSession会话对象，完成sql语句的执行
        SqlSession sqlSession = sqlSessionFactory.openSession();
//            第五步：使用sqlSession 执行sql语句
        UserDao mapper = sqlSession.getMapper(UserDao.class);
        if(mapper.findbyid(2)!=null){
            int i =mapper.delUser(2);
            if(i>=0){
                sqlSession.commit();
                System.out.println("数据删除成功");
            }else {
                sqlSession.rollback();
                System.out.println("数据修改不成功");
            }
        }else {
            System.out.println("表中无此人");
        }
        sqlSession.close();
    }
}


