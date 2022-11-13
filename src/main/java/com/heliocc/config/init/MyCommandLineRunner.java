package com.heliocc.config.init;

import com.heliocc.domain.Person;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class MyCommandLineRunner implements CommandLineRunner{
    @Autowired
    private Person person;

    @Override
    public void run(String... strings) throws Exception {
        log.info("init MyCommandLineRunner");
        log.info("init MyCommandLineRunner Person={}", person.getName());
    }
}
