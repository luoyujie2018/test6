package com.midian.student.service;

import com.alibaba.fastjson.TypeReference;
import com.midian.student.dao.tb_studentMapper;
import com.midian.student.pojo.tb_student;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

@Service("studentService")
public class StudentService {
    @Resource
    public tb_studentMapper studentMapper;

    public tb_student GetStudentList(){
        return  studentMapper.selectByPrimaryKey(1001);
    }
}
