package com.java.Project.Service;

import com.java.Project.Modal.Student;
import org.springframework.stereotype.Service;

import java.util.List;


    @Service
    public class StudentService {

        public List<Student> students() {
            return List.of(
                    new Student(
                            "Omaru Calla", 1, "Male", 29, "11 Koya Street", "Same", "same"));
        }
    }


