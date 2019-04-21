package com.linhuanjie.service;

import com.linhuanjie.entity.ProductInfo;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

/**
 * @author: linhuanjie
 * @description:
 * @createTime : 2019-04-21 9:39
 * @email: lhuanjie@qq.com
 */
public interface ProductService {

    ProductInfo findOne(String productId);

    /**
     * 查询所有在架商品列表
     * @return
     */
    List<ProductInfo> findUpAll();

    Page<ProductInfo> findAll(Pageable pageable);

    ProductInfo save(ProductInfo productInfo);

    // TODO 加库存
//    void increaseStock(List<CartDTO> cartDTOList);

    // TODO 减库存
//    void decreaseStock(List<CartDTO> cartDTOList);

    //上架
    ProductInfo onSale(String productId);

    //下架
    ProductInfo offSale(String productId);
}
