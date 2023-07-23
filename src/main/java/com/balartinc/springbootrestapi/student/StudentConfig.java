package com.balartinc.springbootrestapi.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.List;

import static java.time.Month.*;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(
            StudentRepository repository) {
        return args -> {
            Student harry = new Student(
                    "Harry Potter",
                    "harrypotter@hotmail.com",
                    "Gryffindor",
                    LocalDate.of(2000, JANUARY, 15)
                );

            Student ron = new Student(
                    "Ron weasley",
                    "ronloveh@hotmail.com",
                    "Gryffindor",
                    LocalDate.of(2001, SEPTEMBER, 22)
            );

            repository.saveAll(
                    List.of(harry,
                            ron));
            };
    }
}
