package com.mycollege.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "course")
public class Course {

    @Id
    private int id;
    private String name;
    private String duration;
    private String price;
    private String totalSemester;
}
