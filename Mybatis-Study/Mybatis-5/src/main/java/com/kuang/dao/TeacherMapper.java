package com.kuang.dao;

import com.kuang.pojo.Teacher;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TeacherMapper {


    List<Teacher> getTeachers();

    Teacher getTeacher(@Param("id") int id );
}
