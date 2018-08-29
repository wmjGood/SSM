package cn.cache.util;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

public class SessionFactory {


    private static SqlSessionFactory factory;

    private SessionFactory(){

    }

    public  static SqlSession getSession(){

        try {
            String path="mybatis.xml";
            InputStream rs = Resources.getResourceAsStream(path);
            if (factory==null){
                factory = new SqlSessionFactoryBuilder().build(rs);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return    factory.openSession();
    }
}
