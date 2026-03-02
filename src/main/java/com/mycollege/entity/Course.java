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
    private String id;
    private String name;
    private String acronym;
    private String branch;
    private String courseType;
    private String duration;
    private Integer price;
    private Integer totalSemester;
    private String department;

    public Course(String name,String acronym,String branch,String courseType,String duration,Integer price,Integer totalSemester,String department){
        this.name = name;
        this.acronym = acronym;
        this.branch = branch;
        this.courseType = courseType;
        this.duration = duration;
        this.price = price;
        this.totalSemester = totalSemester;
        this.department = department;
    }

}
