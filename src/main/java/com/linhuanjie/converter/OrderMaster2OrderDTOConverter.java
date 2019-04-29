package com.linhuanjie.converter;


import com.linhuanjie.dto.OrderDTO;
import com.linhuanjie.entity.OrderMaster;
import org.springframework.beans.BeanUtils;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @author: linhuanjie
 * @description:
 * @createTime : 2019-04-25 23:21
 * @email: lhuanjie@qq.com
 */
public class OrderMaster2OrderDTOConverter {

    public static OrderDTO convert(OrderMaster orderMaster) {

        OrderDTO orderDTO = new OrderDTO();
        BeanUtils.copyProperties(orderMaster, orderDTO);
        return orderDTO;
    }

    public static List<OrderDTO> convert(List<OrderMaster> orderMasterList) {
        return orderMasterList.stream().map(e ->
                convert(e)
        ).collect(Collectors.toList());
    }
}
