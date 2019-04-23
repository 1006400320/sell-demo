package com.linhuanjie.dao;

import com.linhuanjie.entity.OrderMaster;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author: linhuanjie
 * @description:
 * @createTime : 2019-04-23 21:22
 * @email: lhuanjie@qq.com
 */
public interface OrderMasterRepository extends JpaRepository<OrderMaster,String> {

    Page<OrderMaster> findByBuyerOpenid(String buyerOpenid, Pageable pageable);
}
