package com.imooc.o2o.controller.frontend;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/frontend")
public class FrontendController {

	/**
	 * 首页路由
	 * 
	 * @return
	 */
	@GetMapping("/index")
	private String index() {
		return "frontend/index";
	}

	/**
	 * 商品列表页路由
	 * 
	 * @return
	 */
	@GetMapping("/shoplist")
	private String showShopList() {
		return "frontend/shoplist";
	}

	/**
	 * 店铺详情页路由
	 * 
	 * @return
	 */
	@GetMapping("/shopdetail")
	private String showShopDetail() {
		return "frontend/shopdetail";
	}

	/**
	 * 商品详情页路由
	 * 
	 * @return
	 */
	@GetMapping("/productdetail")
	private String showProductDetail() {
		return "frontend/productdetail";
	}

	/**
	 * 店铺的奖品列表页路由
	 *
	 * @return
	 */
	@RequestMapping(value = "/awardlist", method = RequestMethod.GET)
	private String showAwardList() {
		return "frontend/awardlist";
	}

	/**
	 * 奖品兑换列表页路由
	 *
	 * @return
	 */
	@RequestMapping(value = "/pointrecord", method = RequestMethod.GET)
	private String showPointRecord() {
		return "frontend/pointrecord";
	}

	/**
	 * 奖品详情页路由
	 *
	 * @return
	 */
	@RequestMapping(value = "/myawarddetail", method = RequestMethod.GET)
	private String showMyAwardDetail() {
		return "frontend/myawarddetail";
	}

	/**
	 * 消费记录列表页路由
	 *
	 * @return
	 */
	@RequestMapping(value = "/myrecord", method = RequestMethod.GET)
	private String showMyRecord() {
		return "frontend/myrecord";
	}

	/**
	 * 用户各店铺积分信息页路由
	 *
	 * @return
	 */
	@RequestMapping(value = "/mypoint", method = RequestMethod.GET)
	private String showMyPoint() {
		return "frontend/mypoint";
	}
}
