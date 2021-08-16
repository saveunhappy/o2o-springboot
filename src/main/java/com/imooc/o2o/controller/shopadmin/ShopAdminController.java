package com.imooc.o2o.controller.shopadmin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "shopadmin", method = {RequestMethod.GET})
public class ShopAdminController {
    //店铺操作添加修改
    @GetMapping("/shopoperation")
    public String shopOperation() {
        return "shop/shopoperation";
    }
    //店铺列表
    @GetMapping("/shoplist")
    public String shoplist() {
        return "shop/shoplist";
    }
    //商品管理页，就是商铺信息，商品管理，类别管理之类的，有几个按钮
    @GetMapping("/shopmanagement")
    public String shopManagement() {
        return "shop/shopmanagement";
    }
    //商品分类，有优先级的那个
    @GetMapping("/productcategorymanagement")
    public String shopProductCategoryManagement() {
        return "shop/productcategorymanagement";
    }
    //商品编辑，有缩略图的那个，优先级，积分，原价，现价，详情图片。
    @GetMapping("/productoperation")
    public String productOperation(){
        return "shop/productoperation";
    }
    //商品管理
    @GetMapping("/productmanagement")
    public String productManagement(){
        return "shop/productmanagement";
    }

    @RequestMapping(value = "/shopauthmanagement")
    public String shopAuthManagement() {
        // 转发至店铺授权页面
        return "shop/shopauthmanagement";
    }

    @RequestMapping(value = "/shopauthedit")
    public String shopAuthEdit() {
        // 转发至授权信息修改页面
        return "shop/shopauthedit";
    }

    @RequestMapping(value = "/operationsuccess", method = RequestMethod.GET)
    private String operationSuccess() {
        // 转发至操作失败的页面
        return "shop/operationsuccess";
    }

    @RequestMapping(value = "/operationfail", method = RequestMethod.GET)
    private String operationFail() {
        // 转发至操作成功的页面
        return "shop/operationfail";
    }

    @RequestMapping(value = "/productbuycheck", method = RequestMethod.GET)
    private String productBuyCheck() {
        // 转发至店铺的消费记录的页面
        return "shop/productbuycheck";
    }

    @RequestMapping(value = "/awardmanagement", method = RequestMethod.GET)
    private String awardManagement() {
        // 奖品管理页路由
        return "shop/awardmanagement";
    }

    @RequestMapping(value = "/awardoperation", method = RequestMethod.GET)
    private String awardEdit() {
        // 奖品编辑页路由
        return "shop/awardoperation";
    }

    @RequestMapping(value = "/usershopcheck", method = RequestMethod.GET)
    private String userShopCheck() {
        // 店铺用户积分统计路由
        return "shop/usershopcheck";
    }

    @RequestMapping(value = "/awarddelivercheck", method = RequestMethod.GET)
    private String awardDeliverCheck() {
        // 店铺用户积分兑换路由
        return "shop/awarddelivercheck";
    }

}
