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
@Document(collection = "lecturer")
public class Lecturer extends Person {

    private String lecturerId;
    private Integer courseId;
    private String lectureTiming;
    private Integer designationId;
}
