package com.java.Project.Controller;

import com.java.Project.Modal.Student;
import com.java.Project.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;



    @RestController
    @RequestMapping("/student")
    public class StudentController {

        private StudentService studentService;

        @Autowired
        public StudentController(StudentService studentService) {
            this.studentService = studentService;
        }

        @GetMapping
        public List<Student> students() {
            return studentService.students();
        }

    }


