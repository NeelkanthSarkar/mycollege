package com.mycollege.service.impl;

import com.mycollege.dto.AddStudentRequest;
import com.mycollege.dto.StudentResponse;
import com.mycollege.dto.UpdateStudentRequest;
import com.mycollege.dto.template.StuedntTemplate;
import com.mycollege.entity.Student;
import com.mycollege.repository.StudentRepository;
import com.mycollege.service.StudentService;
import com.mycollege.util.APIUtils;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.List;
import java.util.Optional;

@Service
public class StudentServiceImpl implements StudentService {

    private final StudentRepository studentRepository;

    public StudentServiceImpl(StudentRepository studentRepository){
        this.studentRepository = studentRepository;
    }

    @Override
    public ResponseEntity<Object> getAllStudents() {
        List<Student> studentList = studentRepository.findAll();
        if(CollectionUtils.isEmpty(studentList)){
            return new ResponseEntity<>("No data found.", HttpStatus.NO_CONTENT);
        }
        else{
            return new ResponseEntity<>(APIUtils.createSuccessResponse(studentList),HttpStatus.OK);
        }
    }

    @Override
    public ResponseEntity<Object> getOneStudentById(int id) {
        Optional<StuedntTemplate> studentOptional = studentRepository.findStudentById(id);
        if(studentOptional.isPresent()){
            StudentResponse studentResponse = APIUtils.mapToStudentResponse(studentOptional.get());
            return new ResponseEntity<>(APIUtils.createSuccessResponse(studentResponse),HttpStatus.OK);
        }
        else{
            return new ResponseEntity<>(APIUtils.createFailureResponse(400,"Student data not found by studentId: "+id),HttpStatus.BAD_REQUEST);
        }
    }

    @Override
    public ResponseEntity<Object> addANewStudent(AddStudentRequest addStudentRequest) {
        return null;
    }

    @Override
    public ResponseEntity<Object> updateExistingStudentDetails(UpdateStudentRequest updateStudentRequest) {
        return null;
    }

    @Override
    public ResponseEntity<Object> deleteExistingStudentById(int id) {
        return null;
    }
}
