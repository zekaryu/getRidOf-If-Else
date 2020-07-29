package com.yuze.demo.f策略and工厂and注解;

import com.yuze.demo.IOrderService;
import com.yuze.demo.OrderDTO;
import java.math.BigDecimal;
import javax.annotation.PostConstruct;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;

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
@Service
public class OrderServiceImpl3 implements IOrderService {

  @Resource
  private HandlerFactory handlerFactory;
  
  @Override
  public String handle(OrderDTO orderDTO) throws Exception {
    return handlerFactory.getHandler(orderDTO).handle(orderDTO);
  }
  
  @PostConstruct
  public void start() throws Exception {
    OrderDTO orderDTO = new OrderDTO();
    orderDTO.setId("1");
    orderDTO.setCode("1");
    orderDTO.setPrice(new BigDecimal(100));
    orderDTO.setType(1);
    String result = handle(orderDTO);
    System.out.println(result);
  }

}