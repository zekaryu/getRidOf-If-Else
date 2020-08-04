package com.yuze.demo.e策略and工厂and反射;


import com.yuze.demo.e策略and工厂and反射.策略类.MemberUserHandler;
import com.yuze.demo.e策略and工厂and反射.策略类.OrdinaryUserHandler;
import com.yuze.demo.e策略and工厂and反射.策略类.VipMemberHandler;

/**
 * ClassName: HandlerType.
 * Function: TODO 功能描述.
 * Reason: TODO 编写原因.
 * Date: 2020/7/29 10:53
 *
 * @author yuze
 * @version 1.0.0
 * @since JDK 1.8
 */
public enum HandlerTypeEnum {

  ORDINARY_USER("1", OrdinaryUserHandler.class.getName()),
  MEMBER_USER("2", MemberUserHandler.class.getName()),
  VIP_MEMBER_USER("3", VipMemberHandler.class.getName()),
  ;

  private String type;
  
  private String className;

  HandlerTypeEnum(String type, String className) {
    this.type = type;
    this.className = className;
  }

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public String getClassName() {
    return className;
  }

  public void setClassName(String className) {
    this.className = className;
  }

  public static HandlerTypeEnum valueOf(int ordinal) {
    if (ordinal <= 0 || ordinal > values().length) {
      throw new IndexOutOfBoundsException("Invalid ordinal");
    }
    return values()[ordinal-1];
  }
}
