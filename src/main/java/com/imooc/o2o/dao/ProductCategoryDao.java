package com.imooc.o2o.dao;

import com.imooc.o2o.entity.ProductCategory;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
@Mapper
public interface ProductCategoryDao {
	/**
	 * 通过shop id 查询店铺商品类别
	 * 
	 * @param long
	 *            shopId
	 * @return List<ProductCategory>
	 */
	List<ProductCategory> queryProductCategoryList(long shopId);

	/**
	 * 批量新增商品类别
	 * 
	 * @param productCategoryList
	 * @return
	 */
	int batchInsertProductCategory(List<ProductCategory> productCategoryList);

	/**
	 * 删除指定商品类别
	 * 
	 * @param productCategoryId
	 * @param shopId
	 * @return effectedNum
	 */
	int deleteProductCategory(@Param("productCategoryId") long productCategoryId, @Param("shopId") long shopId);

}
