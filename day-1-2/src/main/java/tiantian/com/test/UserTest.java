package tiantian.com.test;

import org.apache.ibatis.session.SqlSession;
import org.junit.jupiter.api.Test;
import tiantian.com.Dao.UserMapper;
import tiantian.com.db.Dbutils;
import tiantian.com.pojo.User;

import java.util.HashMap;

public class UserTest {
    @Test
    public void add() {
//      调用接口里的方法
        SqlSession sqlSession = Dbutils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user = new User(null, "张米mi", "男", 31, "河北");
//      传入的是user，所以在usermapper.xml文件里，parameterType  后面为找的数
        int i = mapper.addUser(user);
        if (i >= 0) {
            sqlSession.commit();
            System.out.println("数据插入成功");
        } else {
            sqlSession.rollback();
            System.out.println("数据插入失败");
        }
    }

    @Test
    public void add2() {
        SqlSession sqlSession = Dbutils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        HashMap<String, Object> map = new HashMap<String, Object>();
//        传入的是map
        map.put("id", 3002);
        map.put("name", "天天1");
        map.put("sex", "女");
        map.put("age", 21);
        map.put("address", "北京");

        map.put("id1", 3003);
        map.put("name1", "天天2");
        map.put("sex1", "女");
        map.put("age1", 21);
        map.put("address1", "北静");

        map.put("id2", 3004);
        map.put("name2", "天天3");
        map.put("sex2", "女");
        map.put("age2", 22);
        map.put("address2", "北京");
        int i = mapper.addUser2(map);
        if (i >= 0) {
            sqlSession.commit();
            System.out.println("数据插入成功");
        } else {
            sqlSession.rollback();
            System.out.println("数据插入不成功");
        }

    }

    @Test
    public void findbyid() {
        SqlSession sqlSession = Dbutils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user = mapper.findbyid(2002);
        System.out.println(user.toString());
    }

    @Test
    public void findbyid2() {
        SqlSession sqlSession = Dbutils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        HashMap<String, Object> map = new HashMap<String, Object>();
        map.put("id", 2002);
        map.put("name", "张米");
        User user = mapper.findbyid2(map);
        if (user != null) {
            System.out.println(user.toString());
        } else {
            System.out.println("无此人");
        }
    }

    @Test
    public void update() {
        SqlSession sqlSession = Dbutils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user = new User(2002, "泡泡", "男", 22, "北京");
        int i = mapper.updateUser(user);
        if (mapper.findbyid(2002) != null) {
            if (i > 0) {
                sqlSession.commit();
                System.out.println("数据修改成功");
            } else {
                sqlSession.rollback();
                System.out.println("数据修改不成功");
            }
        } else {
            System.out.println("没有修改的人");
        }
    }

    @Test
    public void update2() {
        SqlSession sqlSession = Dbutils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        HashMap<String, Object> map = new HashMap<String, Object>();
        map.put("id", 2001);
        map.put("name", "张米");
        map.put("sex", "男");
        map.put("address", "北京");

        if (mapper.findbyid(2001) != null) {
            int i =mapper.update2(map);
            if (i > 0) {
                sqlSession.commit();
                System.out.println("数据修改成功");
            } else {
                sqlSession.rollback();
                System.out.println("数据修改不成功");
            }
        } else {
            System.out.println("没有修改的人");
        }
    }
    @Test
    public void findall() {
        SqlSession sqlSession = Dbutils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        for (User user:mapper.findAll()){
            System.out.println(user.toString());
        }
    }
    @Test
    public void del() {
        SqlSession sqlSession = Dbutils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        if (mapper.findbyid(2001)!=null){
            int i = mapper.delUser(2001);
            if (i > 0) {
                sqlSession.commit();
                System.out.println("数据删除成功");
            } else {
                sqlSession.rollback();
                System.out.println("数据删除不成功");
            }
        } else {
            System.out.println("没有修改的人");
        }

        }
        @Test
    public void del2(){
            SqlSession sqlSession = Dbutils.getSqlSession();
            UserMapper mapper = sqlSession.getMapper(UserMapper.class);
            HashMap<String, Object> map = new HashMap<String, Object>();
            map.put("id",2002);
            map.put("name","泡泡");
            if (mapper.findbyid(2002)!=null){
                int i = mapper.delUser2(map);
                if (i > 0) {
                    sqlSession.commit();
                    System.out.println("数据删除成功");
                } else {
                    sqlSession.rollback();
                    System.out.println("数据删除不成功");
                }
            } else {
                System.out.println("没有要删除的人");
            }

        }
    }
