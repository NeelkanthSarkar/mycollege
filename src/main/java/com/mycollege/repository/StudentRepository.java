package com.mycollege.repository;

import com.mycollege.entity.Student;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface StudentRepository extends MongoRepository<Student,String> {
}
