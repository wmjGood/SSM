package cn.cache.dao;




import cn.cache.pojo.Teacher;

import java.io.Serializable;
import java.util.List;

public interface TeacherMapper {
   //根据老师id查询老师下面的老师

    Teacher findAllByTeacher(Serializable id);

    int updateTeacher(Teacher teacher);

    //分页
    List<Teacher> findAllByPage();

    Teacher findAllByProc(Teacher teacher);
}
