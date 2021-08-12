package com.imooc.o2o.dao;

import com.imooc.o2o.entity.ProductSellDaily;
import com.imooc.o2o.entity.Shop;
import org.junit.FixMethodOrder;
import org.junit.Ignore;
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
public class ProductSellDailyDaoTest {
	@Autowired
	private ProductSellDailyDao productSellDailyDao;

	/**
	 * 测试添加功能
	 * 
	 * @throws Exception
	 */
	@Test
	public void testAInsertProductSellDaily() throws Exception {
		// 创建商品日销量统计
		int effectedNum = productSellDailyDao.insertProductSellDaily();
		assertEquals(3, effectedNum);
	}
	
	/**
	 * 测试添加功能
	 * 
	 * @throws Exception
	 */
	@Test
	public void testBInsertDefaultProductSellDaily() throws Exception {
		// 创建商品日销量统计
		//这个就是插入一天没有卖出去的，total不是0的就不插入了。
		int effectedNum = productSellDailyDao.insertDefaultProductSellDaily();
		assertEquals(9, effectedNum);
	}

	/**
	 * 测试查询功能
	 * 
	 * @throws Exception
	 */
	@Test
	@Ignore
	public void testCQueryProductSellDaily() throws Exception {
		ProductSellDaily productSellDaily = new ProductSellDaily();
		// 叠加店铺去查询
		Shop shop = new Shop();
		shop.setShopId(15L);
		productSellDaily.setShop(shop);
		List<ProductSellDaily> productSellDailyList = productSellDailyDao.queryProductSellDailyList(productSellDaily,
				null, null);
		System.out.println(productSellDailyList.size());
	}
}
