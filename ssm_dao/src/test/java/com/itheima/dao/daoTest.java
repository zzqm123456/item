package com.itheima.dao;


import com.itheima.pojo.Items;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@Component
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring_mybatis.xml")
public class daoTest {
    @Autowired
    private ItemsDao itemsDao;
     @Test
    public void itemsTest(){

     List<Items> all = itemsDao.findAll();
     System.out.println(all);
 }

}
