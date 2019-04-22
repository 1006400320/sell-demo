package com.linhuanjie.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @author: linhuanjie
 * @description:
 * @createTime : 2019-04-22 21:18
 * @email: lhuanjie@qq.com
 */
@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class ResultVO<T> {

    /**
     * 错误码
     */
    private Integer code;

    /**
     * 提示信息
     */
    private String msg;

    /**
     * 数据
     */
    private T data;
}
