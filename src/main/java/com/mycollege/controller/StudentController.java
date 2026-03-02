package com.mycollege.controller;

import com.mycollege.dto.AddStudentRequest;
import com.mycollege.dto.UpdateStudentRequest;
import com.mycollege.exception.DatabaseException;
import com.mycollege.service.StudentService;
import com.mycollege.util.APIUtils;
import io.micrometer.common.util.StringUtils;
import org.springframework.http.HttpStatus;
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
    public ResponseEntity<Object> getStudentById(@PathVariable String id){
        if(StringUtils.isBlank(id)){
            return new ResponseEntity<>(APIUtils.createFailureResponse(400,"StudentId cannot be null or empty"), HttpStatus.BAD_REQUEST);
        }
        return studentService.getOneStudentById(id);
    }

    @PostMapping("/add")
    public ResponseEntity<Object> addNewStudent(@RequestBody AddStudentRequest addStudentRequest) throws DatabaseException {

        return studentService.addANewStudent(addStudentRequest);
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
