package com.midian.student.controller;

import com.midian.student.pojo.tb_student;
import com.midian.student.service.StudentService;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.Map;

@RestController
public class StudentController {

    @Resource
    private StudentService studentService;


    @ApiOperation("获取学生列表")
    @RequestMapping(value = {"/getStudent"},method = {RequestMethod.GET,RequestMethod.POST})
    public tb_student GetStudentList(String str){
        System.out.println("接收到的参数"+str);
        return studentService.GetStudentList();
    }

}
