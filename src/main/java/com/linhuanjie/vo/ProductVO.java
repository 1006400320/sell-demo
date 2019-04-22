package com.linhuanjie.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import java.util.List;

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
public class ProductVO {
    @JsonProperty("name")
    private String categoryName;

    @JsonProperty("type")
    private Integer categoryType;

    @JsonProperty("foods")
    private List<ProductInfoVO> productInfoVOList;

}
