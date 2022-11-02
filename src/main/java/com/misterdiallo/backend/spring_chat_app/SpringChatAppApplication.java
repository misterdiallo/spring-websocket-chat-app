package com.misterdiallo.backend.spring_chat_app;

import com.misterdiallo.backend.spring_chat_app.data.TypeMessageEntity;
import com.misterdiallo.backend.spring_chat_app.data.TypeMessageRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.annotation.EnableScheduling;

import java.time.Instant;
import java.util.Date;

@SpringBootApplication
@EnableScheduling
public class SpringChatAppApplication {
    private static final Logger log = LoggerFactory.getLogger(SpringChatAppApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(SpringChatAppApplication.class, args);
    }

    @Bean
    public CommandLineRunner userDemo(TypeMessageRepository typeMessageRepository) {
        return (args) -> {
            // creating all type of messages
//            log.info("------------Creating Default Type of Messages---------------");
//            typeMessageRepository.save(new TypeMessageEntity(
//                    "text",
//                    "TEXT",
//                    Date.from(Instant.now()),
//                    Date.from(Instant.now())
//            ));
//            typeMessageRepository.save(new TypeMessageEntity(
//                    "image",
//                    "IMAGE",
//                    Date.from(Instant.now()),
//                    Date.from(Instant.now())
//            ));
//            typeMessageRepository.save(new TypeMessageEntity(
//                    "video",
//                    "VIDEO",
//                    Date.from(Instant.now()),
//                    Date.from(Instant.now())
//            ));
//            typeMessageRepository.save(new TypeMessageEntity(
//                    "file",
//                    "FILE",
//                    Date.from(Instant.now()),
//                    Date.from(Instant.now())
//            ));
//            typeMessageRepository.save(new TypeMessageEntity(
//                    "link",
//                    "LINK",
//                    Date.from(Instant.now()),
//                    Date.from(Instant.now())
//            ));
//            typeMessageRepository.save(new TypeMessageEntity(
//                    "forward",
//                    "FORWARD",
//                    Date.from(Instant.now()),
//                    Date.from(Instant.now())
//            ));
//            typeMessageRepository.save(new TypeMessageEntity(
//                    "voice",
//                    "VOICE",
//                    Date.from(Instant.now()),
//                    Date.from(Instant.now())
//            ));
//            typeMessageRepository.save(new TypeMessageEntity(
//                    "unknown",
//                    "UNKNOWN",
//                    Date.from(Instant.now()),
//                    Date.from(Instant.now())
//            ));

//            // fetch all type of message
//            log.info("------------ALL Default Type of Messages---------------");
//            for (TypeMessageEntity typeMessage : typeMessageRepository.findAll()) {
//                log.info(typeMessage.toString());
//            }
            log.info("");
        };
    }

}
