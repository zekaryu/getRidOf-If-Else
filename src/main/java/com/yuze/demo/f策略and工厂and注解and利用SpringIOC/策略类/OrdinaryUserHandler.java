package com.yuze.demo.f策略and工厂and注解and利用SpringIOC.策略类;

import com.yuze.demo.OrderDTO;
import com.yuze.demo.f策略and工厂and注解and利用SpringIOC.策略类注解.HandlerType;
import org.springframework.stereotype.Component;

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
@Component
@HandlerType("1")
public class OrdinaryUserHandler implements IOrderHandler {

  @Override
  public String handle(OrderDTO orderDTO) {
    return "普通用户";
  }
}
