package com.yuze.demo.a普通;

import com.yuze.demo.IOrderService;
import com.yuze.demo.OrderDTO;

/**
 * ClassName: OrderServiceImpl1.
 * Function: TODO 功能描述.
 * Reason: TODO 编写原因.
 * Date: 2020/7/29 9:36
 *
 * @author yuze
 * @version 1.0.0
 * @since JDK 1.8
 */
public class OrderServiceImpl1 implements IOrderService {

  @Override
  public String handle(OrderDTO orderDTO) {
    Integer type = orderDTO.getType();
    if ("1".equals(type)) {
      return "普通用户";
    }else if ("2".equals(type)) {
      return "会员";
    } else if ("3".equals(type)) {
      return "VIP会员";
    }
    return null;
  }
}
