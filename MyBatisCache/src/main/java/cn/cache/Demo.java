package cn.cache;


import cn.cache.dao.TeacherMapper;
import cn.cache.pojo.Teacher;
import cn.cache.util.SessionFactory;
import com.github.pagehelper.PageHelper;
import org.apache.ibatis.session.SqlSession;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

public class Demo {
    SqlSession session=null;
    TeacherMapper mapper=null;
    @Before
    public    void  brfore(){

        session = SessionFactory.getSession();
        mapper=session.getMapper(TeacherMapper.class);

    }

    @After
    public  void  after(){
        session.commit();
        session.close();
    }

    //一级缓存and二级缓存
    @Test
    public  void testCache(){
        Teacher teacher = mapper.findAllByTeacher(3);
        System.out.println(teacher);
        System.out.println("---------------------------");
        teacher.setTname("小哈哈哈");
        int count = mapper.updateTeacher(teacher);
        System.out.println(count);
        System.out.println("-----------------------");
        teacher = mapper.findAllByTeacher(3);
        System.out.println(teacher);
    }

   // 分页
    @Test
    public  void testPage(){
        //分页
        PageHelper.startPage(1,3);
        List<Teacher> teachers = mapper.findAllByPage();
        System.out.println(teachers);
    }

    //存储过程
    @Test
    public  void  testProc(){

        //存储过程
        Teacher teacher=new Teacher();
        teacher.setTid(2);
        System.out.println(teacher.getTname());
        mapper.findAllByProc(teacher);
        System.out.println(teacher.getTname());

    }



}
