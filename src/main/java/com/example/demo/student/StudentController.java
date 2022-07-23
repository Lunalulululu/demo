package com.example.demo.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

// GetMapping is a Spring notation and is widely used in mapping GET requests onto
// some specific handler methods

@RestController
// map web requests onto specific handler classes or handler method
@RequestMapping(path="api/v1/student")
public class StudentController {

    private final StudentService studentService;

    // inject object dependencies (attribute) into constructor
    @Autowired
    public StudentController(StudentService studentService)
    {
        this.studentService = studentService;
    }

    @GetMapping
    public List<Student> getStudents() {
        return studentService.getStudents();
    }
}
