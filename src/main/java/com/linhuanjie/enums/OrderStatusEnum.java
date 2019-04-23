package com.linhuanjie.enums;

import lombok.Getter;

/**
 * @author: linhuanjie
 * @description:
 * @createTime : 2019-04-23 21:16
 * @email: lhuanjie@qq.com
 */
@Getter
public enum OrderStatusEnum {
    NEW(0, "新订单"),
    FINISHED(1, "完结"),
    CANCEL(2, "已取消"),
    ;

    private Integer code;

    private String message;

    OrderStatusEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
