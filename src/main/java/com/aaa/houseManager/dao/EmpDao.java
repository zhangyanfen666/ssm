package com.aaa.houseManager.dao;

import java.util.List;
import java.util.Map;

public interface EmpDao {
    /**
     * 查询员工信息
     * @return
     */
    List<Map> queryEmp();
}
