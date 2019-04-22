package com.linhuanjie.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import java.math.BigDecimal;

/**
 * @author: linhuanjie
 * @description:
 * @createTime : 2019-04-22 23:37
 * @email: lhuanjie@qq.com
 */
@Data
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class ProductInfoVO {

    @JsonProperty("id")
    private String productId;

    @JsonProperty("name")
    private String productName;

    @JsonProperty("price")
    private BigDecimal productPrice;

    @JsonProperty("description")
    private String productDescription;

    @JsonProperty("icon")
    private String productIcon;
}
