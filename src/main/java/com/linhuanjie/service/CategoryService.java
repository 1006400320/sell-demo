package com.linhuanjie.service;

import com.linhuanjie.entity.ProductCategory;

import java.util.List;

/**
 * @author: linhuanjie
 * @description:
 * @createTime : 2019-04-21 12:16
 * @email: lhuanjie@qq.com
 */
public interface CategoryService {

    ProductCategory findOne(Integer categoryId);

    List<ProductCategory> findAll();

    List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList);

    ProductCategory save(ProductCategory productCategory);
}
