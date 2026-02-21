package com.mycollege.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@EqualsAndHashCode(callSuper = false)
@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "department")
public class Department {

    @Id
    private String id;

    private String title;
    private String description;
    private int totalMember;
    private String createdDate;
}
