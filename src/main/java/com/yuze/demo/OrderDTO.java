package com.yuze.demo;

import java.math.BigDecimal;
import lombok.Data;

/**
 * ClassName: OrderDTO.
 * Function: TODO 功能描述.
 * Reason: TODO 编写原因.
 * Date: 2020/7/29 9:33
 *
 * @author yuze
 * @version 1.0.0
 * @since JDK 1.8
 */
@Data
public class OrderDTO {
  private String id;
  
  private String code;
  
  private BigDecimal price;
  /**  
   * type: 购买渠道，1.普通用户，2.会员，3.VIP会员.  
   * @since JDK 1.8  
   */
  private Integer type;

}
