package com.linhuanjie.enums;


import lombok.Getter;

/**
 * @author: linhuanjie
 * @description:
 * @createTime : 2019-04-20 23:28
 * @email: lhuanjie@qq.com
 */
@Getter
public enum ProductStatusEnum {

    UP(0,"上线"),
    DOWN(1,"下线")
    ;

    private Integer code;
    private String message;

    ProductStatusEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
