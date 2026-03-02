package com.mycollege.controller;

import com.mycollege.entity.Course;
import com.mycollege.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CourseController {

    @Autowired
    private CourseRepository courseRepository;

    @GetMapping("/course/all")
    public ResponseEntity<Object> getAllCources(){
        List<Course> courseList = courseRepository.findAll();
        return new ResponseEntity<>(courseList, HttpStatus.OK);
    }

}
