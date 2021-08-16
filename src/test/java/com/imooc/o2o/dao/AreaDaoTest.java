package com.imooc.o2o.dao;

import com.imooc.o2o.entity.Area;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;
@RunWith(SpringRunner.class)
@SpringBootTest
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class AreaDaoTest  {
    @Autowired
    private AreaDao areaDao;
    @Test
    public void testQueryArea() throws Exception{
        List<Area> areaList = areaDao.queryArea();
        assertEquals(4,areaList.size());
    }
}
