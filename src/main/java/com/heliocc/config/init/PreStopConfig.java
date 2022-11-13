package com.heliocc.config.init;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.annotation.Configuration;

@Slf4j
@Configuration
public class PreStopConfig implements InitializingBean, DisposableBean {
    @Override
    public void destroy() throws Exception {
        log.info("PreStopConfig destroy");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        log.info("PreStopConfig afterPropertiesSet");
    }
}
