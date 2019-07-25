package com.aaa.houseManager.dao;

import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;
@Repository
public interface StudentDao {
    /**
     * 查询所有学生信息
     * @return
     */
    @Select("select * from student")
    List<Map> queryStudent();

    /**
     * 根据id查询学生信息
     * @param id
     * @return
     */
    @Select("select * from student where id=#{id}")
    List<Map> queryById(Integer id);
}
