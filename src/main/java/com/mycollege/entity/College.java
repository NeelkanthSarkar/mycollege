package com.mycollege.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@EqualsAndHashCode(callSuper = false)
@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "college")
public class College {

    @Id
    private int id;

    private String name;
    private String moto;
    private int addressId;
    private String collegeCode;
    private List<String> certifications;
    private String tier;
    private String chairman;
    private String dean;
}
