package com.linhuanjie.exception;

import com.linhuanjie.enums.ResultEnum;

/**
 * @author: linhuanjie
 * @description:
 * @createTime : 2019-04-25 21:57
 * @email: lhuanjie@qq.com
 */
public class SellException extends RuntimeException {

    private Integer code;

    public SellException(ResultEnum resultEnum) {
        super(resultEnum.getMessage());
        this.code = resultEnum.getCode();
    }

    public SellException(String message, Integer code) {
        super(message);
        this.code = code;
    }
}
