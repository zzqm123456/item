package com.itheima.service;

import com.itheima.pojo.Items;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

    @Component
    @RunWith(SpringJUnit4ClassRunner.class)
    @ContextConfiguration(locations = "classpath:spring-aop.xml")
    public class ServiceTest {
        @Autowired
        private ItemsService itemsService;

        @Test
        public void itemsTest() {

            List<Items> items = itemsService.itemsLIst();

            System.out.println(items);
        }
    }

