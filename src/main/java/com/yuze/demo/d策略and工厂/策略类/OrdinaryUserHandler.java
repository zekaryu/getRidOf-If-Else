package com.yuze.demo.d策略and工厂.策略类;

import com.yuze.demo.OrderDTO;
import com.yuze.demo.e策略and工厂and反射.策略类.IOrderHandler;

/**
 * ClassName: OrdinaryUserHandler.
 * Function: TODO 功能描述.
 * Reason: TODO 编写原因.
 * Date: 2020/7/29 10:29
 *
 * @author yuze
 * @version 1.0.0
 * @since JDK 1.8
 */
public class OrdinaryUserHandler implements IOrderHandler {

  @Override
  public String handler(OrderDTO orderDTO) {
    return "普通用户";
  }
}
