package com.mycollege.entity;

import com.mycollege.general.Person;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

@EqualsAndHashCode(callSuper = false)
@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "student")
public class Student extends Person {

    private String fatherName;
    private String motherName;
    private int courseId;
    private int enrollmentYear;
    private String status;
    private String batch;

}
