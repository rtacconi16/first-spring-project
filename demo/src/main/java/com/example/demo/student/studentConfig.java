package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import static java.time.Month.*;

@Configuration
public class studentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student emily = new Student(
                    "Emily",
                    "emily@gmail.com",
                    LocalDate.of(1989, DECEMBER, 31)
            );

            Student tatto = new Student(
                    "Tatto",
                    "tattononi@gmail.com",
                    LocalDate.of(2000, MARCH, 16)
            );

            repository.saveAll(List.of(emily, tatto));
        };
    }
}
