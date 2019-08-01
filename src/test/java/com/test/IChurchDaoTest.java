package com.test;

import com.alibaba.fastjson.JSON;
import com.dao.IChurchDao;
import com.model.Church;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring-mybatis.xml"})
public class IChurchDaoTest {

    @Autowired
    private IChurchDao churchDao;

    @Test
    public void testGetChurch() {
        String churchId = "4455ba6a12f26e08";
        Church church = churchDao.get(churchId);
        System.out.println(JSON.toJSON(church));
    }

    @Test
    public void testListChurch() {
        List<Church> list = churchDao.list();
        System.out.println(JSON.toJSON(list));
    }
}
