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
    private int totalMembers;
    private String createdDate;

    public Department(String title, String description, int totalMembers, String createdDate) {
        this.title = title;
        this.description = description;
        this.totalMembers = totalMembers;
        this.createdDate = createdDate;
    }
}
