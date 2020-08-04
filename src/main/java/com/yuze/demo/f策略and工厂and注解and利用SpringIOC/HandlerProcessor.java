package com.yuze.demo.f策略and工厂and注解and利用SpringIOC;

import com.google.common.collect.Maps;
import com.yuze.demo.f策略and工厂and注解and利用SpringIOC.策略工厂.HandlerFactory;
import com.yuze.demo.f策略and工厂and注解and利用SpringIOC.策略类.IOrderHandler;
import com.yuze.demo.f策略and工厂and注解and利用SpringIOC.策略类注解.HandlerType;
import java.util.Map;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.stereotype.Component;

/**
 * ClassName: HandlerProcessor.
 * Function: TODO 功能描述.
 * Reason: TODO 编写原因.
 * Date: 2020/7/29 13:57
 *
 * @author yuze
 * @version 1.0.0
 * @since JDK 1.8
 */
@Component
@SuppressWarnings("unchecked")
public class HandlerProcessor implements BeanFactoryPostProcessor {

  private static final String HANDLER_PACAKGE = "com.yuze.demo.f策略and工厂and注解";

  @Override
  public void postProcessBeanFactory(
      ConfigurableListableBeanFactory configurableListableBeanFactory) throws BeansException {
    Map<String,  Class<IOrderHandler>> handlerMap = Maps.newHashMapWithExpectedSize(3);
    com.yuze.demo.f策略and工厂and注解.ClassScanner.scan(HANDLER_PACAKGE, HandlerType.class).forEach(clazz->{
      String type = ((HandlerType) clazz.getAnnotation(HandlerType.class)).value();
      handlerMap.put(type, clazz);
      
    });
    //初始化HandleFactory,将其注入spring容器
    HandlerFactory handlerFactory = new HandlerFactory(handlerMap);
    configurableListableBeanFactory
        .registerSingleton(HandlerFactory.class.getName(), handlerFactory);
    
  }
}
