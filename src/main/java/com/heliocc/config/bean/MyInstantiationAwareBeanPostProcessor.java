package com.heliocc.config.bean;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeansException;
import org.springframework.beans.PropertyValues;
import org.springframework.beans.factory.config.InstantiationAwareBeanPostProcessor;
import org.springframework.stereotype.Component;

import java.beans.PropertyDescriptor;

/**
 * 这个扩展点非常有用 ，无论是写中间件和业务中，都能利用这个特性。
 * 比如对实现了某一类接口的bean在各个生命期间进行收集，
 * 或者对某个类型的bean进行统一的设值等等
 */
@Slf4j
@Component
public class MyInstantiationAwareBeanPostProcessor  implements InstantiationAwareBeanPostProcessor {
    /**
     * 初始化bean之前，相当于把bean注入spring上下文之前
     * @param bean
     * @param beanName
     * @return
     * @throws BeansException
     */
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        if("person".equals(beanName)){
            log.info("InstantiationAwareBeanPostProcessor::postProcessBeforeInitialization");
        }
        return bean;
    }

    /**
     * 初始化bean之后，相当于把bean注入spring上下文之后
     * @param bean
     * @param beanName
     * @return
     * @throws BeansException
     */
    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {

        if("person".equals(beanName)){
            log.info("InstantiationAwareBeanPostProcessor::postProcessAfterInitialization");
        }
        return bean;
    }


    /**
     * 实例化bean之前，相当于new这个bean之前
     * @param beanClass
     * @param beanName
     * @return
     * @throws BeansException
     */
    @Override
    public Object postProcessBeforeInstantiation(Class<?> beanClass, String beanName) throws BeansException {

        if("person".equals(beanName)){
            log.info("InstantiationAwareBeanPostProcessor::postProcessBeforeInstantiation");
        }
        return null;
    }

    /**
     * 实例化bean之后，相当于new这个bean之后
     * @param bean
     * @param beanName
     * @return
     * @throws BeansException
     */
    @Override
    public boolean postProcessAfterInstantiation(Object bean, String beanName) throws BeansException {

        if("person".equals(beanName)){
            log.info("InstantiationAwareBeanPostProcessor::postProcessAfterInstantiation");
        }
        return true;
    }

    /**
     * bean已经实例化完成，在属性注入时阶段触发， @Autowired, @Resource等注解原理基于此方法实现
     * @param pvs
     * @param pds
     * @param bean
     * @param beanName
     * @return
     * @throws BeansException
     */
    @Override
    public PropertyValues postProcessPropertyValues(PropertyValues pvs, PropertyDescriptor[] pds, Object bean, String beanName) throws BeansException {

        if("person".equals(beanName)){
            log.info("InstantiationAwareBeanPostProcessor::postProcessPropertyValues");
        }
        return pvs;
    }
}
