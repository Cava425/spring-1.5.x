package com.heliocc.config.bean;

import com.heliocc.domain.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfig {

    @Bean("person")
    Person getPerson(){
        Person person = new Person();
        person.setId(1L);
        person.setName("No.1");
        return person;
    }

}
