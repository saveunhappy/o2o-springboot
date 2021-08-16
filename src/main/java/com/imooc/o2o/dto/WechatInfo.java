package com.imooc.o2o.dto;

import lombok.Data;

/**
 * 用来接收平台二维码的信息
 * @author xiangze
 *
 */
@Data
public class WechatInfo {
	private Long customerId;
	private Long productId;
	private Long userAwardId;
	private Long createTime;
	private Long shopId;
}
