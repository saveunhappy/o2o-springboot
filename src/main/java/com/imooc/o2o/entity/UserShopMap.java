package com.imooc.o2o.entity;

import lombok.Data;

import java.util.Date;

//顾客店铺积分映射
@Data
public class UserShopMap {
	// 主键Id
	private Long userShopId;
	// 创建时间
	private Date createTime;
	// 顾客在该店铺的积分
	private Integer point;
	// 顾客信息实体类
	private PersonInfo user;
	// 店铺信息实体类
	private Shop shop;
}
