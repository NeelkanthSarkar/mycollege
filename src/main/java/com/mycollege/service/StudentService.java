package com.mycollege.service;

import com.mycollege.dto.AddStudentRequest;
import com.mycollege.dto.UpdateStudentRequest;
import org.springframework.http.ResponseEntity;

public interface StudentService {

    ResponseEntity<Object> getAllStudents();
    ResponseEntity<Object> getOneStudentById(int id);
    ResponseEntity<Object> addANewStudent(AddStudentRequest addStudentRequest);
    ResponseEntity<Object> updateExistingStudentDetails(UpdateStudentRequest updateStudentRequest);
    ResponseEntity<Object> deleteExistingStudentById(int id);
}
