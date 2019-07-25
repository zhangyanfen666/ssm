package com.aaa.houseManager.controller;

import com.aaa.houseManager.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;
@RestController
public class StudentController {
    @Autowired
    private StudentService studentService;
    @RequestMapping("/queryStudent")
    public Object queryStudent(){
        System.out.println(1/0);
        List<Map> studentlist = studentService.queryStudent();
        return studentlist;
    }
    @RequestMapping("/queryById")
    public Object queryById(Integer id){
        Map student = studentService.queryById(id);
        return student;
    }
}
