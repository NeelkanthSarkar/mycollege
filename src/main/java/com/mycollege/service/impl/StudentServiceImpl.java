package com.mycollege.service.impl;

import com.mongodb.internal.operation.AggregateOperation;
import com.mycollege.dto.AddStudentRequest;
import com.mycollege.dto.StudentResponse;
import com.mycollege.dto.UpdateStudentRequest;
import com.mycollege.dto.template.StuedntTemplate;
import com.mycollege.entity.Address;
import com.mycollege.entity.Course;
import com.mycollege.entity.Student;
import com.mycollege.exception.DatabaseException;
import com.mycollege.repository.AddressRepository;
import com.mycollege.repository.CourseRepository;
import com.mycollege.repository.StudentRepository;
import com.mycollege.service.StudentService;
import com.mycollege.util.APIUtils;
import com.mycollege.util.Mapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.aggregation.*;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.List;
import java.util.Optional;

@Slf4j
@Service
public class StudentServiceImpl implements StudentService {

    private final StudentRepository studentRepository;

    private final AddressRepository addressRepository;

    private final CourseRepository courseRepository;

    private final MongoTemplate mongoTemplate;

    public StudentServiceImpl(StudentRepository studentRepository,AddressRepository addressRepository,CourseRepository courseRepository,MongoTemplate mongoTemplate){
        this.studentRepository = studentRepository;
        this.addressRepository = addressRepository;
        this.courseRepository = courseRepository;
        this.mongoTemplate = mongoTemplate;
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
    public ResponseEntity<Object> getOneStudentById(String id) {
        Optional<StuedntTemplate> studentOptional = studentRepository.findByStudentId(id);
        if(studentOptional.isPresent()){
            StudentResponse studentResponse = Mapper.mapToStudentResponse(studentOptional.get());
            return new ResponseEntity<>(APIUtils.createSuccessResponse(studentResponse),HttpStatus.OK);
        }
        else{
            return new ResponseEntity<>(APIUtils.createFailureResponse(400,"Student data not found by studentId: "+id),HttpStatus.BAD_REQUEST);
        }
    }

    @Override
    public ResponseEntity<Object> addANewStudent(AddStudentRequest addStudentRequest) throws DatabaseException{

        checkStudentAlreadyExists(addStudentRequest.getMobileNo(),addStudentRequest.getEmail());
        Course course = validateCourseId(addStudentRequest.getCourseId());
        int studentCountByCourse = getStudentCountByCourse(course.getId());
        Address address = Mapper.mapToAddress(addStudentRequest);
        String addressId = saveAddress(address);
        Student student = Mapper.mapAddNewStudentEntity(addStudentRequest,course,addressId,studentCountByCourse);
        try {
            studentRepository.save(student);
            return new ResponseEntity<>(APIUtils.createSuccessResponse("New Student added successfully"),HttpStatus.OK);
        }catch (Exception e){
            log.error("Exception while add new student. ErrorMessage: "+e.getMessage());
            throw new DatabaseException("Exception while add new student. ErrorMsg:"+e.getMessage());
        }
    }

    private String saveAddress(Address address) throws DatabaseException {
        try {
            Address savedAddress = addressRepository.save(address);
            return savedAddress.getId();
        }catch (Exception e){
            log.error("Exception while add new address. ErrorMessage: "+e.getMessage());
            throw new DatabaseException("Exception while add new address. ErrorMsg:"+e.getMessage());
        }
    }

    private Course validateCourseId(String courseId) throws DatabaseException {
        try {
            Optional<Course> courseOptional = courseRepository.findById(courseId);
            return courseOptional.orElseThrow(()->new DatabaseException("Course does not exists. CourseId: "+courseId));
        }catch (Exception exception){
            throw new DatabaseException("Exception while get course by courseId. ErrorMsg: "+exception.getMessage());
        }
    }

    private void checkStudentAlreadyExists(String mobileNo, String email) {
    }

    private int getStudentCountByCourse(String courseId) throws DatabaseException {
        try {
            Query query = new Query().addCriteria(Criteria.where("courseId").is(courseId));
            long count = mongoTemplate.count(query,Student.class);
            return Math.toIntExact(count);
        }catch (Exception exception){
            throw new DatabaseException("Exception while executing get student count by courseId query. ErrorMsg: "+exception.getMessage());
        }
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
