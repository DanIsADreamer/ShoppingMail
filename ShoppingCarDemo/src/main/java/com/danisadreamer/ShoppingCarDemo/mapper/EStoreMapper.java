package com.danisadreamer.ShoppingCarDemo.mapper;

import com.danisadreamer.ShoppingCarDemo.been.Product;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @auther 芮狼Dan
 * @date 2019-06-20 02:03
 */
@Mapper
public interface EStoreMapper {

    List<Product> quarryAllHotProduct();

}
