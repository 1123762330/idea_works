package com.itheima.service;


import com.itheima.domain.Province;

import java.util.List;

public interface ProvinceService {

    public List<Province> findAll();

    public String findAllJson();

    public void addName(String cityName);
}
