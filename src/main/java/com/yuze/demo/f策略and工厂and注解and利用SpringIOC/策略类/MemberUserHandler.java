package com.yuze.demo.f策略and工厂and注解;

import com.yuze.demo.OrderDTO;
import org.springframework.stereotype.Component;

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
@Component
@HandlerType("2")
public class MemberUserHandler implements IOrderHandler {

  @Override
  public String handle(OrderDTO orderDTO) {
    return "会员";
  }
}
