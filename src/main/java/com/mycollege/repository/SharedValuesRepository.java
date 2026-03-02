package com.mycollege.repository;

import com.mycollege.entity.SharedValues;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface SharedValuesRepository extends MongoRepository<SharedValues,String> {
}
