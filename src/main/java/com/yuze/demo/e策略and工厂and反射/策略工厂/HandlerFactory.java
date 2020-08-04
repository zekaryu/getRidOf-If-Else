package com.yuze.demo.e策略and工厂and反射.策略工厂;

import com.yuze.demo.OrderDTO;
import com.yuze.demo.e策略and工厂and反射.HandlerTypeEnum;
import com.yuze.demo.e策略and工厂and反射.策略类.IOrderHandler;

/**
 * ClassName: HandlerFactory.
 * Function: TODO 功能描述.
 * Reason: TODO 编写原因.
 * Date: 2020/7/29 10:48
 *
 * @author yuze
 * @version 1.0.0
 * @since JDK 1.8
 */
public class HandlerFactory {
  
  public static IOrderHandler getHandler(OrderDTO orderDTO) throws Exception {
    Integer type = orderDTO.getType();
    return (IOrderHandler) Class.forName(HandlerTypeEnum.valueOf(type).getClassName()).newInstance();
  }
}
