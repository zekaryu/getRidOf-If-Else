package com.yuze.demo;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

/**
 * ClassName: SpringContext.
 * Function: TODO 功能描述.
 * Reason: TODO 编写原因.
 * Date: 2020/7/29 15:46
 *
 * @author yuze
 * @version 1.0.0
 * @since JDK 1.8
 */

@Component
public class SpringContextUtil implements ApplicationContextAware {

  private static ApplicationContext applicationContext;

  @Override
  public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
    SpringContextUtil.applicationContext = applicationContext;
  }

  //获取applicationContext
  public static ApplicationContext getApplicationContext() {
    return applicationContext;
  }

  // 通过name获取 Bean
  public static Object getBean(String name) {
    return getApplicationContext().getBean(name);
  }

  // 通过class获取Bean
  public static <T> T getBean(Class<T> clazz) {
    return getApplicationContext().getBean(clazz);
  }

  // 通过name,以及Clazz返回指定的Bean
  public static <T> T getBean(String name, Class<T> clazz) {
    return getApplicationContext().getBean(name, clazz);
  }

}
