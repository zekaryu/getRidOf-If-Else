package com.yuze.demo.e策略and工厂and反射;

import com.yuze.demo.OrderDTO;

/**
 * ClassName: MemberUserHandler.
 * Function: TODO 功能描述.
 * Reason: TODO 编写原因.
 * Date: 2020/7/29 10:31
 *
 * @author yuze
 * @version 1.0.0
 * @since JDK 1.8
 */
public class MemberUserHandler implements IOrderHandler {

  @Override
  public String handler(OrderDTO orderDTO) {
    return "会员";
  }
}
