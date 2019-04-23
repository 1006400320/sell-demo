package com.linhuanjie.enums;

import lombok.Getter;

/**
 * @author: linhuanjie
 * @description:
 * @createTime : 2019-04-23 21:17
 * @email: lhuanjie@qq.com
 */
@Getter
public enum PayStatusEnum {

    WAIT(0, "等待支付"),
    SUCCESS(1, "支付成功"),

    ;

    private Integer code;

    private String message;

    PayStatusEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
