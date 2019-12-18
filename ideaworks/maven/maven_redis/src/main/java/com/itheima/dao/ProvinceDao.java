package com.itheima.dao;

import com.itheima.domain.Province;

import java.util.List;

public interface ProvinceDao {
    //查询所有
    List<Province> findAll();

    //添加城市
    void addName(String cityName);
}
