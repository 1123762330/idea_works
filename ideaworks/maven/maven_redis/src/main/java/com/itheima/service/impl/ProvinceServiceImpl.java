package com.itheima.service.impl;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.itheima.dao.ProvinceDao;
import com.itheima.dao.impl.ProvinceDaoImpl;
import com.itheima.domain.Province;
import com.itheima.service.ProvinceService;
import com.itheima.util.JedisPoolUtils;
import redis.clients.jedis.Jedis;

import java.util.List;

public class ProvinceServiceImpl implements ProvinceService {
    //声明dao
    private ProvinceDao dao = new ProvinceDaoImpl();

    /*public ProvinceDao dao;*/

    @Override
    public List<Province> findAll() {
        List<Province> list = dao.findAll();
        System.out.println("查询到的:"+list);
        return list;
    }

    /**
     * 使用redis缓存
     */

    @Override
    public String findAllJson() {
        //1.先从redis中查询数据
        //1.1获取redis客户端连接
        Jedis jedis = JedisPoolUtils.getJedis();
        String province_json = jedis.get("province");

        //2判断 province_json 数据是否为null
        if (province_json == null || province_json.length() == 0) {
            //redis中没有数据
            System.out.println("redis中没数据，查询数据库...");
            //2.1从数据中查询
            List<Province> ps = dao.findAll();
            //2.2将list序列化为json
            ObjectMapper mapper = new ObjectMapper();
            try {
                province_json = mapper.writeValueAsString(ps);
            } catch (JsonProcessingException e) {
                e.printStackTrace();
            }

            //2.3 将json数据存入redis
            jedis.set("province", province_json);
            //归还连接
            jedis.close();

        } else {
            System.out.println("redis中有数据，查询缓存...");
        }


        return province_json;
    }

    @Override
    public void addName(String cityName) {
        //1.先从redis中查询数据
        Jedis jedis = JedisPoolUtils.getJedis();
        String province_json = jedis.get("province");

        //3.进行判断,有没有相同的城市
        if(province_json.contains(cityName)){
            findAllJson();//有相同的城市就直接调用查询
        }else {
            //2.清除缓存
            jedis.del("province");
            dao.addName(cityName);//没有就添加
        }
    }
}
