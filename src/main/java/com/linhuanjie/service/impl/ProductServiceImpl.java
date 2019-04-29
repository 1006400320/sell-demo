package com.linhuanjie.service.impl;

import com.linhuanjie.dao.ProductInfoRepository;
import com.linhuanjie.dto.CartDTO;
import com.linhuanjie.entity.ProductInfo;
import com.linhuanjie.enums.ProductStatusEnum;
import com.linhuanjie.enums.ResultEnum;
import com.linhuanjie.exception.SellException;
import com.linhuanjie.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

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
    public void increaseStock(List<CartDTO> cartDTOList) {

    }

    @Override
    @Transactional(rollbackOn = SellException.class)
    public void decreaseStock(List<CartDTO> cartDTOList) {
        for (CartDTO cartDTO : cartDTOList) {
            ProductInfo productInfo = repository.findById(cartDTO.getProductId()).orElse(null);
            if (null == productInfo) {
                throw new SellException(ResultEnum.PRODUCT_NOT_EXIST);
            }
            Integer productStock = productInfo.getProductStock();
            int result = productStock - cartDTO.getProductQuantity();
            if (result < 0){
                throw new SellException(ResultEnum.PRODUCT_STOCK_ERROR);
            }

            productInfo.setProductStock(result);
            repository.save(productInfo);
        }
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
