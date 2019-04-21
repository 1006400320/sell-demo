package com.linhuanjie.dao;

import com.linhuanjie.entity.ProductInfo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

/**
 * @author: linhuanjie
 * @description:
 * @createTime : 2019-04-21 9:38
 * @email: lhuanjie@qq.com
 */
public interface ProductInfoRepository extends JpaRepository<ProductInfo,String> {

    List<ProductInfo> findByProductStatus(Integer productStatus);

    List<ProductInfo> findByProductDescriptionLike (String s);
}
