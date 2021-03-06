package com.linhuanjie.entity;

import com.linhuanjie.enums.ProductStatusEnum;
import lombok.*;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.util.Date;

/**
 * @author: linhuanjie
 * @description:
 * @createTime : 2019-04-20 23:24
 * @email: lhuanjie@qq.com
 */
@Entity
@Data
@Builder
@DynamicUpdate
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class ProductInfo {

    @Id
    private String productId;

    /** 名字. */
    private String productName;

    /** 单价. */
    private BigDecimal productPrice;

    /** 库存. */
    private Integer productStock;

    /** 描述. */
    private String productDescription;

    /** 小图. */
    private String productIcon;

    /** 状态, 0正常1下架. */
    private Integer productStatus = ProductStatusEnum.UP.getCode();

    /** 类目编号. */
    private Integer categoryType;

    private Date createTime;

    private Date updateTime;
}
