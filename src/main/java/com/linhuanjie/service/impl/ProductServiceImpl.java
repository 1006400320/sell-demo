package com.linhuanjie.service.impl;

import com.linhuanjie.dao.ProductInfoRepository;
import com.linhuanjie.entity.ProductInfo;
import com.linhuanjie.enums.ProductStatusEnum;
import com.linhuanjie.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author: linhuanjie
 * @description:
 * @createTime : 2019-04-21 9:40
 * @email: lhuanjie@qq.com
 */
@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductInfoRepository repository;

    @Override
    public ProductInfo findOne(String productId) {
        return repository.findById(productId).orElse(null);
    }

    @Override
    public List<ProductInfo> findUpAll() {
        return repository.findByProductStatus(ProductStatusEnum.UP.getCode());
    }

    @Override
    public Page<ProductInfo> findAll(Pageable pageable) {
        return repository.findAll(pageable);
    }

    @Override
    public ProductInfo save(ProductInfo productInfo) {
        return repository.save(productInfo);
    }

    @Override
    public ProductInfo onSale(String productId) {
        // TODO
        return null;
    }

    @Override
    public ProductInfo offSale(String productId) {
        // TODO
        return null;
    }
}
