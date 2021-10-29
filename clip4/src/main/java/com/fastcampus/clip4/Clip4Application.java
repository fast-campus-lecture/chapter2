package com.fastcampus.clip4;

import com.fastcampus.clip4.model.Animal;
import com.fastcampus.clip4.producer.ClipProducer;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Clip4Application {

    public static void main(String[] args) {
        SpringApplication.run(Clip4Application.class, args);
    }

    @Bean
    public ApplicationRunner runner(ClipProducer clipProducer) {
        return args -> {
            clipProducer.async("clip4-animal", new Animal("puppy", 15));
        };
    }
}
