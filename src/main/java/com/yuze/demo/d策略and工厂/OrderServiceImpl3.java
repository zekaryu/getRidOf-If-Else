package com.yuze.demo.d策略and工厂;

import com.yuze.demo.IOrderService;
import com.yuze.demo.OrderDTO;

/**
 * ClassName: OrderServiceImpl3.
 * Function: TODO 功能描述.
 * Reason: TODO 编写原因.
 * Date: 2020/7/29 10:28
 *
 * @author yuze
 * @version 1.0.0
 * @since JDK 1.8
 */
public class OrderServiceImpl3 implements IOrderService {

  
  @Override
  public String handle(OrderDTO orderDTO) {
    IOrderHandler orderHandler = HandlerFactory.getHandler(orderDTO);
    assert orderHandler != null;
    return orderHandler.handler(orderDTO);
  }
}