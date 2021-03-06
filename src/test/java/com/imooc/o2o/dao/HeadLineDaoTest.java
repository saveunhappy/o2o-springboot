package com.imooc.o2o.dao;

import com.imooc.o2o.entity.HeadLine;
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
public class HeadLineDaoTest {
    @Autowired
    private HeadLineDao headLineDao;
    @Test
    public void testQueryArea() throws Exception{
        List<HeadLine> headLines = headLineDao.queryHeadLine(new HeadLine());
        assertEquals(4,headLines.size());
    }

}