package com.yuze.demo.e策略and工厂and反射;

import com.yuze.demo.IOrderService;
import com.yuze.demo.OrderDTO;
import java.math.BigDecimal;

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
  public String handle(OrderDTO orderDTO) throws Exception {
    IOrderHandler orderHandler = HandlerFactory.getHandler(orderDTO);
    assert orderHandler != null;
    return orderHandler.handler(orderDTO);
  }


  public static void main(String[] args) throws Exception {
    OrderDTO orderDTO = new OrderDTO();
    orderDTO.setId("1");
    orderDTO.setCode("1");
    orderDTO.setPrice(new BigDecimal(100));
    orderDTO.setType(1);
    OrderServiceImpl3 orderServiceImpl3 = new OrderServiceImpl3();
    System.out.println(orderServiceImpl3.handle(orderDTO));
  }
}