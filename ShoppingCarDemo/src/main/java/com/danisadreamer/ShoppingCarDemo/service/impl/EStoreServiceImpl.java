package com.danisadreamer.ShoppingCarDemo.service.impl;

import com.danisadreamer.ShoppingCarDemo.been.Product;
import com.danisadreamer.ShoppingCarDemo.mapper.EStoreMapper;
import com.danisadreamer.ShoppingCarDemo.service.EStoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @auther 芮狼Dan
 * @date 2019-06-20 02:02
 */
@Service
public class EStoreServiceImpl implements EStoreService {
    @Autowired
    EStoreMapper eStoreMapper;

    @Override
    public List<Product> quarryAllHotProduct() {
        return eStoreMapper.quarryAllHotProduct();
    }
}
