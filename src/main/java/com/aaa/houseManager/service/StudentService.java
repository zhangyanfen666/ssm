package com.aaa.houseManager.service;

import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;

public interface StudentService {
    /**
     * 查询所有学生信息
     * @return
     */
    List<Map> queryStudent();

    /**
     * 根据id查询学生信息
     * @param id
     * @return
     */
    Map queryById(Integer id);
}
