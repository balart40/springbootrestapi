package com.balartinc.springbootrestapi.student;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Service
public class HogwartsStudentService {

    public List<Student> getStudents() {
        return List.of(
                new Student(
                        1L,
                        "Harry Potter",
                        "harrypotter@hotmail.com",
                        "Gryffindor",
                        LocalDate.of(2000, Month.JANUARY, 15),
                        21

                )
        );
    }
}
