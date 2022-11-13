package com.heliocc;

import com.heliocc.config.MyApplicationContextInitializer;
import com.heliocc.domain.Person;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Slf4j
@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        // SpringApplication.run(Application.class, args);
        SpringApplication application = new SpringApplication(Application.class);
        application.addInitializers(new MyApplicationContextInitializer());
        application.run(args);
    }

}
