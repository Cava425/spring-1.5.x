package com.heliocc.config.init;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.annotation.Configuration;

import javax.annotation.PostConstruct;

@Slf4j
@Configuration
public class InitConfig implements InitializingBean {

    @Override
    public void afterPropertiesSet() throws Exception {
        log.info("InitConfig afterPropertiesSet");
    }

    @PostConstruct
    public void init(){
        log.info("InitConfig @PostConstruct init");
    }
}
