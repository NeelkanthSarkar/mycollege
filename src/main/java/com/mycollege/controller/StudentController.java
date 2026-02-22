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
    public ResponseEntity<Object> getAllStudents(){
        return studentService.getAllStudents();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Object> getStudentById(@PathVariable Integer id){
        return studentService.getOneStudentById(id);
    }

    @PostMapping("/add")
    public ResponseEntity<Object> addNewStudent(@RequestBody AddStudentRequest addStudentRequest){
        return null;
    }

    @PutMapping("/update")
    public ResponseEntity<Object> updateStudentDetails(@RequestBody UpdateStudentRequest updateStudentRequest){
        return null;
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Object> deleteStudentById(@PathVariable Integer id){
        return null;
    }
}
