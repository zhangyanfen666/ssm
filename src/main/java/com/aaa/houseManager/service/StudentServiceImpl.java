package com.aaa.houseManager.service;

import com.aaa.houseManager.dao.StudentDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
@Service
public class StudentServiceImpl implements  StudentService {
    @Autowired
    private StudentDao studentDao;

    @Override
    public List<Map> queryStudent() {
        return studentDao.queryStudent();
    }

    @Override
    public Map queryById(Integer id) {
        List<Map> stuentlist = studentDao.queryById(id);
        Map student = stuentlist.get(0);
        return student;
    }
}
