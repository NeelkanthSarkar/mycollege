package com.mycollege.service;

import com.mycollege.dto.AddStudentRequest;
import com.mycollege.dto.UpdateStudentRequest;
import org.springframework.http.ResponseEntity;

public interface StudentService {

    ResponseEntity<?> getAllStudents();
    ResponseEntity<?> getOneStudentById(int id);
    ResponseEntity<?> addANewStudent(AddStudentRequest addStudentRequest);
    ResponseEntity<?> updateExistingStudentDetails(UpdateStudentRequest updateStudentRequest);
    ResponseEntity<?> deleteExistingStudentById(int id);
}
