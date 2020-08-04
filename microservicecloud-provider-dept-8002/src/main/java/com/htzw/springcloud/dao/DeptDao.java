package com.htzw.springcloud.dao;

import com.htzw.springcloud.entities.Dept;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author gu.lian.jun
 * @version 1.0
 * @date 2020/7/27 15:44
 */
@Mapper
public interface DeptDao {
    public boolean addDept(Dept dept);
    public Dept findById(Long id);
    public List<Dept> findAll();
}

