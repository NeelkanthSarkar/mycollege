package com.mycollege.controller;

import com.mycollege.repository.CourseRepository;
import com.mycollege.repository.DepartmentRepository;
import com.mycollege.repository.SharedValuesRepository;
import com.mycollege.util.Constant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Autowired
    private CourseRepository courseRepository;

    @Autowired
    private DepartmentRepository departmentRepository;

    @Autowired
    private SharedValuesRepository sharedValuesRepository;

    @GetMapping("/init")
    public ResponseEntity<Object> initDBData(){
        courseRepository.saveAll(Constant.courseList);
        departmentRepository.saveAll(Constant.departments);
        sharedValuesRepository.saveAll(Constant.sharedValues);
        return new ResponseEntity<>("Course,Department and SharedValues are stored in MongoDB successfully", HttpStatus.OK);
    }
}
