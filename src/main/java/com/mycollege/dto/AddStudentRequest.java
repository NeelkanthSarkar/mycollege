package com.mycollege.dto;

import com.mycollege.general.Person;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@EqualsAndHashCode(callSuper = false)
@Data
@AllArgsConstructor
@NoArgsConstructor
public class AddStudentRequest {

    private String firstName;
    private String middleName;
    private String lastName;
    private int age;
    private String courseId;
    private String mobileNo;
    private String email;
    private String dateOfBirth;
    private String fatherName;
    private String motherName;

    private String address1;
    private String address2;
    private String city;
    private String state;
    private String country;
    private String pinCode;
    private String landMark;

}
