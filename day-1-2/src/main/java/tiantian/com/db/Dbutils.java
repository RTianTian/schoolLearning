package tiantian.com.db;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

public class Dbutils {
//    1. 采用静态工厂封装
    private static SqlSessionFactory sqlSessionFactory;
//   2. 采用静态化的方式初始化工厂
    static {
        String s = "mybatis.xml";
        try {
            InputStream in = Resources.getResourceAsStream(s);
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(in);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
//    3. 创建SqlSession 对象，用于数据库的各种操作
// openSession底层就是做各种成员变量的初始化
    public static SqlSession getSqlSession(){
        return sqlSessionFactory.openSession();
    }
}
