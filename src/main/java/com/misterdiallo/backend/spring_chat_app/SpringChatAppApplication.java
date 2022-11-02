package com.misterdiallo.backend.spring_chat_app;

import com.misterdiallo.backend.spring_chat_app.data.TypeMessageEntity;
import com.misterdiallo.backend.spring_chat_app.data.TypeMessageRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringChatAppApplication {
    private static final Logger log = LoggerFactory.getLogger(SpringChatAppApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(SpringChatAppApplication.class, args);
    }

//    @Bean
//    public CommandLineRunner userDemo(TypeMessageRepository typeMessageRepository) {
//        return (args) -> {
//            // creating all type of messages
//            log.info("---------------------------");
//            typeMessageRepository.save(new TypeMessageEntity(
//                    "dss",
//
//            ));
//
//            // create users
//            userRepository.save(new User("John Doe", "john.doe@example.com"));
//
//            // fetch all users
//            log.info("Users found with findAll():");
//            for (User user : userRepository.findAll()) {
//                log.info(user.toString());
//            }
//            log.info("");
//
//        };
//    }

}
