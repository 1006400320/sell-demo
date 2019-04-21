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
        ProductInfo productInfo = new ProductInfo();
        productInfo.setProductId("99999");
        productInfo.setProductName("皮蛋瘦肉粥");
        productInfo.setProductPrice(800);
        productInfo.setProductStock(200);
        productInfo.setProductDescription("传说中的黯然销魂粥");
        productInfo.setProductIcon("http://xxxx.jpg");
        productInfo.setProductStatus(ProductStatusEnum.UP.getCode());
        productInfo.setCategoryType(1);

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