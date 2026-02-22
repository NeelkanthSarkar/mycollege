package com.mycollege.dto;

import com.mycollege.entity.Address;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class StudentResponse {

    private int id;
    private String firstName;
    private String middleName;
    private String lastName;
    private int age;
    private Address address;
    private String role;
    private String mobileNo;
    private String email;
    private String dateOfBirth;
    private String fatherName;
    private String motherName;
    private String course;
    private int enrollmentYear;
    private String status;
    private String batch;
}
