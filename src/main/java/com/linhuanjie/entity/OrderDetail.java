package com.linhuanjie.entity;

import lombok.*;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;

/**
 * @author: linhuanjie
 * @description:
 * @createTime : 2019-04-23 21:19
 * @email: lhuanjie@qq.com
 */
@Entity
@Data
@Builder
@DynamicUpdate
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class OrderDetail {
    @Id
    private String detailId;

    /** 订单id. */
    private String orderId;

    /** 商品id. */
    private String productId;

    /** 商品名称. */
    private String productName;

    /** 商品单价. */
    private BigDecimal productPrice;

    /** 商品数量. */
    private Integer productQuantity;

    /** 商品小图. */
    private String productIcon;
}
