package com.yuze.demo.e策略and工厂and反射;

import com.yuze.demo.OrderDTO;

/**
 * ClassName: IOrderHandler.
 * Function: TODO 功能描述.
 * Reason: TODO 编写原因.
 * Date: 2020/7/29 10:28
 *
 * @author yuze
 * @version 1.0.0
 * @since JDK 1.8
 */
public interface IOrderHandler {

  String handler(OrderDTO orderDTO);
}
