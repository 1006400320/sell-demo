package com.linhuanjie.dao;

import com.linhuanjie.entity.ProductCategory;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @author: linhuanjie
 * @description:
 * @createTime : 2019-04-21 12:16
 * @email: lhuanjie@qq.com
 */
public interface ProductCategoryRepository extends JpaRepository<ProductCategory, Integer> {

    List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList);
}
