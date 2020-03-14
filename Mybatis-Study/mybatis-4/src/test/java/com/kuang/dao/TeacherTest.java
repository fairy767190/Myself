package com.kuang.dao;

import com.kuang.pojo.Student;
import com.kuang.pojo.Teacher;
import com.kuang.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class TeacherTest {

@Test
    public void getTeachers(){

    SqlSession sqlSession = MybatisUtils.getSqlSession();

    TeacherMapper mapper = sqlSession.getMapper(TeacherMapper.class);

    List<Teacher> teachers = mapper.getTeachers();

    for (Teacher teacher : teachers) {
        System.out.println(teacher);
    }


    sqlSession.close();

}

@Test
    public void getStudents(){

    SqlSession sqlSession = MybatisUtils.getSqlSession();

    StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);

    List<Student> users = mapper.getUsers();

    for (Student user : users) {

        System.out.println(user);
    }


    sqlSession.close();
}


    @Test
    public void getStudents2(){

        SqlSession sqlSession = MybatisUtils.getSqlSession();

        StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);

        List<Student> users = mapper.getUsers2();

        for (Student user : users) {

            System.out.println(user);
        }


        sqlSession.close();
    }


}
