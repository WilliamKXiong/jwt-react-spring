package com.jwt.configurations;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.jwt.entities.Person;
import com.jwt.repositories.PersonRepository;

@Configuration
public class LoadDatabase {

  private static final Logger log = LoggerFactory.getLogger(LoadDatabase.class);

  @Bean
  CommandLineRunner initDatabase(PersonRepository personRepository) {

    return args -> {
      //log.info("Preloading " + personRepository.save(new Person("admin", "admin", "admin@admin.com")));
      //log.info("Preloading " + personRepository.save(new Person("Stew", "Pid", "leet133t@harvard.com")));
      //log.info("Preloading " + personRepository.save(new Person("Ug", "Lee", "ug_lee@beauty.com")));
    };
  }
}
