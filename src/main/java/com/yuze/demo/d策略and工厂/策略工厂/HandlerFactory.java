package com.yuze.demo.d策略and工厂.策略工厂;

import com.yuze.demo.OrderDTO;
import com.yuze.demo.e策略and工厂and反射.策略类.IOrderHandler;
import com.yuze.demo.e策略and工厂and反射.策略类.MemberUserHandler;
import com.yuze.demo.e策略and工厂and反射.策略类.OrdinaryUserHandler;
import com.yuze.demo.e策略and工厂and反射.策略类.VipMemberHandler;

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

  public static final Integer ORDINARY_USER_TYPE = 1;

  public static final Integer MEMBER_USER_TYPE = 2;

  public static final Integer VIP_MEMBER_USER_TYPE = 3;
  
  public static IOrderHandler getHandler(OrderDTO orderDTO) {
    Integer type = orderDTO.getType();
    IOrderHandler orderHandler =null;
    if (ORDINARY_USER_TYPE.equals(type)) {
      orderHandler = new OrdinaryUserHandler();
    }else if (MEMBER_USER_TYPE.equals(type)) {
      orderHandler = new MemberUserHandler();
    } else if (VIP_MEMBER_USER_TYPE.equals(type)) {
      orderHandler = new VipMemberHandler();
    }
    return orderHandler;
  }
}
