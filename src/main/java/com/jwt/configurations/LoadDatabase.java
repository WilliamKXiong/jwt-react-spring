package com.jwt.configurations;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.jwt.entities.User;
import com.jwt.repositories.UserRepository;

@Configuration
class LoadDatabase {

  private static final Logger log = LoggerFactory.getLogger(LoadDatabase.class);

  @Bean
  CommandLineRunner initDatabase(UserRepository userRepository) {

    return args -> {
      log.info("Preloading " + userRepository.save(new User("admin", "admin")));
      log.info("Preloading " + userRepository.save(new User("Billy", "Bob")));
    };
  }
}
