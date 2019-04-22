package com.linhuanjie.enums;

import lombok.Getter;

/**
 * @author: linhuanjie
 * @description:
 * @createTime : 2019-04-22 23:28
 * @email: lhuanjie@qq.com
 */
@Getter
public enum ResultVOCodeEnum {
    SUCCESS(0,"成功"),
    ERROR(1,"错误");


    private Integer code;
    private String msg;

    ResultVOCodeEnum(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }
}
