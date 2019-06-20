package com.danisadreamer.ShoppingCarDemo.controller;

import com.danisadreamer.ShoppingCarDemo.been.Product;
import com.danisadreamer.ShoppingCarDemo.been.ResponseUtil;
import com.danisadreamer.ShoppingCarDemo.service.EStoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @auther 芮狼Dan
 * @date 2019-06-20 01:55
 */
@RestController
public class EStoreController {
    @Autowired
    EStoreService eStoreService;


    /**
     * 热门商品
     * @return
     */
    @RequestMapping("/hotProductList")
    private Object quaryHotProduct(){
        try {
            List<Product> productList = eStoreService.quarryAllHotProduct();
            return ResponseUtil.ok(productList);
        }catch (Exception e){
            return ResponseUtil.error("数据库链接错误,请联系管理员！");
        }


    }
}
