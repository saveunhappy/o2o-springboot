package com.imooc.o2o.dao;

import com.imooc.o2o.entity.PersonInfo;
import com.imooc.o2o.entity.WechatAuth;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;

import static org.junit.Assert.assertEquals;
@RunWith(SpringRunner.class)
@SpringBootTest
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class WechatAuthDaoTest {
    @Autowired
    private WechatAuthDao wechatAuthDao;
    @Test
    public void testAInsertWechatAuth() throws Exception{
        //新增一条微信号
        WechatAuth wechatAuth = new WechatAuth();
        PersonInfo personInfo = new PersonInfo();
        personInfo.setUserId(11L);
        //给微信账号绑定上用户信息
        wechatAuth.setPersonInfo(personInfo);
        //随意设置上OpenId
        wechatAuth.setOpenId("aaaaa");
        wechatAuth.setCreateTime(new Date());
        int i = wechatAuthDao.insertWechatAuth(wechatAuth);
        assertEquals(1,i);
    }
    @Test
    public void testBQueryWechatAuthByOpenId() throws Exception{
        WechatAuth wechatAuth = wechatAuthDao.queryWechatInfoByOpenId("aaaaa");
        assertEquals("测试",wechatAuth.getPersonInfo().getName());
    }
}