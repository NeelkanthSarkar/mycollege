package com.mycollege.service;

import com.mycollege.dto.AddStudentRequest;
import com.mycollege.dto.UpdateStudentRequest;
import com.mycollege.exception.DatabaseException;
import org.springframework.http.ResponseEntity;

public interface StudentService {

    ResponseEntity<Object> getAllStudents();
    ResponseEntity<Object> getOneStudentById(String id);
    ResponseEntity<Object> addANewStudent(AddStudentRequest addStudentRequest) throws DatabaseException;
    ResponseEntity<Object> updateExistingStudentDetails(UpdateStudentRequest updateStudentRequest);
    ResponseEntity<Object> deleteExistingStudentById(int id);
}
