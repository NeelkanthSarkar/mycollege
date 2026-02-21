package com.mycollege.controller;

import com.mycollege.dto.AddStudentRequest;
import com.mycollege.dto.UpdateStudentRequest;
import com.mycollege.service.StudentService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/student")
public class StudentController {

    private final StudentService studentService;

    public StudentController(StudentService studentService){
        this.studentService = studentService;
    }

    @GetMapping("/all")
    public ResponseEntity<?> getAllStudents(){
        return null;
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getStudentById(String id){
        return null;
    }

    @PostMapping("/add")
    public ResponseEntity<?> addNewStudent(AddStudentRequest addStudentRequest){
        return null;
    }

    @PutMapping("/update")
    public ResponseEntity<?> updateStudentDetails(UpdateStudentRequest updateStudentRequest){
        return null;
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteStudentById(String id){
        return null;
    }
}
