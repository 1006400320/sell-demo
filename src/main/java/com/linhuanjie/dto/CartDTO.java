package com.linhuanjie.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @author: linhuanjie
 * @description:
 * @createTime : 2019-04-25 23:21
 * @email: lhuanjie@qq.com
 */

@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class CartDTO {
    /** 商品Id. */
    private String productId;

    /** 数量. */
    private Integer productQuantity;
}
