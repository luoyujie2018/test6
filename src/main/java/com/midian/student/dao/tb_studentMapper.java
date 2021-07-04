package com.midian.student.dao;

import com.midian.student.pojo.tb_student;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface tb_studentMapper {
    int deleteByPrimaryKey(Integer studentno);

    int insert(tb_student record);

    int insertSelective(tb_student record);

    tb_student selectByPrimaryKey(Integer studentno);

    int updateByPrimaryKeySelective(tb_student record);

    int updateByPrimaryKey(tb_student record);
}