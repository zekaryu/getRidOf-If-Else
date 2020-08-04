package com.yuze.demo.f策略and工厂and注解and利用SpringIOC.策略工厂;

import com.yuze.demo.OrderDTO;
import com.yuze.demo.SpringContextUtil;
import com.yuze.demo.f策略and工厂and注解and利用SpringIOC.策略类.IOrderHandler;
import java.util.Map;

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
  
  private Map<String, Class<IOrderHandler>> handlerMap;

  public HandlerFactory(Map<String, Class<IOrderHandler>> handlerMap) {
    this.handlerMap = handlerMap;
  }

  public IOrderHandler getHandler(OrderDTO orderDTO) throws Exception {
    String type = String.valueOf(orderDTO.getType());
    Class<IOrderHandler> clazz = handlerMap.get(type);
    if (null == clazz) {
      throw new IllegalArgumentException(String.format("找不到type为 %s 的处理器", type));
    }
    return (IOrderHandler) SpringContextUtil.getBean(clazz);
  }
}
