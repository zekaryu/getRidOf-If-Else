package com.yuze.demo.b静态变量;

import com.yuze.demo.IOrderService;
import com.yuze.demo.OrderDTO;

/**
 * ClassName: OrderServiceImpl2.
 * Function: TODO 功能描述.
 * Reason: TODO 编写原因.
 * Date: 2020/7/29 9:40
 *
 * @author yuze
 * @version 1.0.0
 * @since JDK 1.8
 */
public class OrderServiceImpl2 implements IOrderService {

  public static final Integer ORDINARY_USER_TYPE = 1;

  public static final Integer MEMBER_USER_TYPE = 2;

  public static final Integer VIP_MEMBER_USER_TYPE = 3;

  @Override
  public String handle(OrderDTO orderDTO) {
    Integer type = orderDTO.getType();
    if (ORDINARY_USER_TYPE.equals(type)) {
      return "普通用户";
    }else if (MEMBER_USER_TYPE.equals(type)) {
      return "会员";
    } else if (VIP_MEMBER_USER_TYPE.equals(type)) {
      return "VIP会员";
    }
    return null;
  }
}
