package com.linhuanjie.controller;

import com.linhuanjie.entity.ProductCategory;
import com.linhuanjie.entity.ProductInfo;
import com.linhuanjie.service.CategoryService;
import com.linhuanjie.service.ProductService;
import com.linhuanjie.utils.ResultVOUtil;
import com.linhuanjie.vo.ProductInfoVO;
import com.linhuanjie.vo.ProductVO;
import com.linhuanjie.vo.ResultVO;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author: linhuanjie
 * @description:
 * @createTime : 2019-04-22 21:05
 * @email: lhuanjie@qq.com
 */

@RestController
@RequestMapping("/buyer/product")
public class BuyerProductController {

    @Autowired
    private ProductService productService;
    @Autowired
    private CategoryService categoryService;


    @RequestMapping("/list")
    public ResultVO list(){
        //1. 查询所有的上架商品
        List<ProductInfo> productInfoList = productService.findUpAll();

        //2. 查询类目(一次性查询)
        List<Integer> categoryTypeList= productInfoList.stream()
                .map(e -> e.getCategoryType())
                .distinct()
                .collect(Collectors.toList());
        List<ProductCategory> productCategoryList = categoryService.findByCategoryTypeIn(categoryTypeList);

        //3.数据拼装
        List<ProductVO> productVOList = new ArrayList<>();
        for (ProductCategory productCategory : productCategoryList) {
            List<ProductInfoVO> productInfoVOList = new ArrayList<>();
            for (ProductInfo productInfo : productInfoList) {
                if(null != productCategory.getCategoryType() &&
                        productCategory.getCategoryType().equals(productInfo.getCategoryType())){

                    ProductInfoVO productInfoVO = ProductInfoVO.builder().build();
                    BeanUtils.copyProperties(productInfo,productInfoVO);
                    productInfoVOList.add(productInfoVO);
                }
            }
            ProductVO productVO = ProductVO.builder()
                    .categoryName(productCategory.getCategoryName())
                    .categoryType(productCategory.getCategoryType())
                    .productInfoVOList(productInfoVOList)
                    .build();
            productVOList.add(productVO);
        }
        return ResultVOUtil.success(productVOList);
    }


}
