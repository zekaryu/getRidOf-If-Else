package com.yuze.demo.c策略模式;

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

  public static final Integer ORDINARY_USER_TYPE = 1;

  public static final Integer MEMBER_USER_TYPE = 2;

  public static final Integer VIP_MEMBER_USER_TYPE = 3;

  @Override
  public String handle(OrderDTO orderDTO) {
    Integer type = orderDTO.getType();
    IOrderHandler orderHandler =null;
    if (ORDINARY_USER_TYPE.equals(type)) {
      orderHandler = new OrdinaryUserHandler();
    }else if (MEMBER_USER_TYPE.equals(type)) {
      orderHandler = new MemberUserHandler();
    } else if (VIP_MEMBER_USER_TYPE.equals(type)) {
      orderHandler = new VipMemberHandler();
    }
    assert orderHandler != null;
    return orderHandler.handler(orderDTO);
  }
}