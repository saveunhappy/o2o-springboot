package com.imooc.o2o.dao;

import com.imooc.o2o.entity.HeadLine;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class HeadLineDaoTest {
    @Autowired
    private HeadLineDao headLineDao;
    @Test
    public void testQueryArea() throws Exception{
        List<HeadLine> headLines = headLineDao.queryHeadLine(new HeadLine());
        assertEquals(4,headLines.size());
    }

}