package com.linhuanjie.service.impl;

import com.linhuanjie.entity.ProductInfo;
import com.linhuanjie.enums.ProductStatusEnum;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.List;

/**
 * @author: linhuanjie
 * @description:
 * @createTime : 2019-04-21 10:29
 * @email: lhuanjie@qq.com
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductServiceImplTest {
    @Autowired
    private ProductServiceImpl service;

    @Test
    public void findOne() {
        ProductInfo one = service.findOne("99999");
        Assert.assertEquals("99999",one.getProductId());
    }

    @Test
    public void findUpAll() {
        List<ProductInfo> upAll = service.findUpAll();
        Assert.assertNotEquals(0,upAll.size());
    }

    @Test
    public void findAll() {
        PageRequest request = new PageRequest(0, 2);
        Page<ProductInfo> all = service.findAll(request);
        Assert.assertNotEquals(0,all.getTotalElements());
    }

    @Test
    public void save() {
        ProductInfo productInfo = ProductInfo.builder()
                .productId("123457")
                .productName("皮皮虾")
                .productPrice(320)
                .productStock(100)
                .productDescription("很好吃的虾")
                .productIcon("http://xxxxx.jpg")
                .productStatus(ProductStatusEnum.UP.getCode())
                .categoryType(2)
                .build();

        ProductInfo result = service.save(productInfo);
        Assert.assertNotNull(result);
    }

    @Test
    public void onSale() {
        // TODO
    }

    @Test
    public void offSale() {
        // TODO
    }
}