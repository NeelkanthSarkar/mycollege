package com.mycollege.service.impl;

import com.mycollege.dto.AddStudentRequest;
import com.mycollege.dto.UpdateStudentRequest;
import com.mycollege.entity.Student;
import com.mycollege.repository.StudentRepository;
import com.mycollege.service.StudentService;
import com.mycollege.util.APIUtils;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    private final StudentRepository studentRepository;

    public StudentServiceImpl(StudentRepository studentRepository){
        this.studentRepository = studentRepository;
    }

    @Override
    public ResponseEntity<?> getAllStudents() {
        List<Student> studentList = studentRepository.findAll();
        if(CollectionUtils.isEmpty(studentList)){
            return new ResponseEntity<>("No data found.", HttpStatus.NO_CONTENT);
        }
        else{
            return new ResponseEntity<>(APIUtils.createAPIResponse(200,"Success",studentList),HttpStatus.OK);
        }
    }

    @Override
    public ResponseEntity<?> getOneStudentById(int id) {
        return null;
    }

    @Override
    public ResponseEntity<?> addANewStudent(AddStudentRequest addStudentRequest) {
        return null;
    }

    @Override
    public ResponseEntity<?> updateExistingStudentDetails(UpdateStudentRequest updateStudentRequest) {
        return null;
    }

    @Override
    public ResponseEntity<?> deleteExistingStudentById(int id) {
        return null;
    }
}
