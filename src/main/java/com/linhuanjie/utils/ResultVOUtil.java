package com.linhuanjie.utils;

import com.linhuanjie.enums.ResultVOCodeEnum;
import com.linhuanjie.vo.ResultVO;

import java.util.Optional;

/**
 * @author: linhuanjie
 * @description:
 * @createTime : 2019-04-22 23:27
 * @email: lhuanjie@qq.com
 */
public class ResultVOUtil {

    public static ResultVO success(Object object){
        ResultVO resultVO = new ResultVO();
        resultVO.setCode(ResultVOCodeEnum.SUCCESS.getCode());
        resultVO.setMsg(ResultVOCodeEnum.SUCCESS.getMsg());
        resultVO.setData(object);
        return resultVO;
    }

    public static ResultVO success(){return success(null);}

    public static ResultVO error(Optional<Integer> code, Optional<String> msg){
        ResultVO resultVO = new ResultVO();
        resultVO.setCode(code.orElse(ResultVOCodeEnum.ERROR.getCode()));
        resultVO.setMsg(msg.orElse(ResultVOCodeEnum.ERROR.getMsg()));
        return resultVO;
    }



}
