package com.example.demo.student;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Service
public class StudentService {

    public List<Student> getStudent(){
        return List.of(
                new Student(
                        1L,
                        "Richar",
                        "daymaku90@gmail.com",
                        LocalDate.of(1990, Month.APRIL, 4 ),
                        21
                )

        );
    }

}
