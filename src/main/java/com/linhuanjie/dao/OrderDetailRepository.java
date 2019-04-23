package com.linhuanjie.dao;

import com.linhuanjie.entity.OrderDetail;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @author: linhuanjie
 * @description:
 * @createTime : 2019-04-23 21:22
 * @email: lhuanjie@qq.com
 */
public interface OrderDetailRepository extends JpaRepository<OrderDetail,String> {
    List<OrderDetail> findByOrderId(String orderId);
}
