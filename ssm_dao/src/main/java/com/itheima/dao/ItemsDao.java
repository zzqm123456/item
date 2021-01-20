package com.itheima.dao;

import com.itheima.pojo.Items;

import java.util.List;

public interface ItemsDao {
    /**
     * 查询所有
     * @return
     */
    List<Items>findAll();

    /**int
     * 保存数据
     * @param items
     */
     void save(Items items);
}
