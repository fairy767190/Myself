package com.kuang.dao;

import com.kuang.pojo.Teacher;
import com.kuang.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class TeacherTest {

    @Test
    public void getTeachers() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();

        TeacherMapper mapper = sqlSession.getMapper(TeacherMapper.class);

        List<Teacher> teachers = mapper.getTeachers();

        for (Teacher teacher : teachers) {

            System.out.println(teacher);
        }

        sqlSession.close();
    }

    @Test
    public void getTeacher() {
        {
            SqlSession sqlSession = MybatisUtils.getSqlSession();

            TeacherMapper mapper = sqlSession.getMapper(TeacherMapper.class);

            Teacher teachers = mapper.getTeacher(1);

                System.out.println(teachers);

            sqlSession.close();
        }
    }
}
