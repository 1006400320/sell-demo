package com.linhuanjie.dao;

import com.linhuanjie.entity.ProductInfo;
import com.linhuanjie.enums.ProductStatusEnum;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.*;

/**
 * @author: linhuanjie
 * @description:
 * @createTime : 2019-04-21 9:41
 * @email: lhuanjie@qq.com
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductInfoRepositoryTest {

    @Autowired
    private ProductInfoRepository repository;


    @Test
    public void findByProductStatus() {
        List<ProductInfo> result = repository.findByProductStatus(ProductStatusEnum.UP.getCode());
        Assert.assertEquals(1,result.size());
    }

    @Test
    public void saveTest(){
        ProductInfo productInfo = ProductInfo.builder()
                .productId("99999")
                .productName("皮蛋瘦肉粥")
                .productPrice(800)
                .productStock(100)
                .productDescription("传说中的黯然销魂粥")
                .productIcon("http://xxxxx.jpg")
                .productStatus(ProductStatusEnum.UP.getCode())
                .categoryType(2)
                .build();

        ProductInfo result = repository.save(productInfo);
        Assert.assertEquals("99999",result.getProductId());
    }

    @Test
    public void findByProductDescriptionLikeTest(){
        List<ProductInfo> list = repository.findByProductDescriptionLike("%肠粉");
        for (ProductInfo productInfo : list) {
            System.out.println(productInfo.toString());
        }
        Assert.assertNotEquals(0,list.size());
    }
}