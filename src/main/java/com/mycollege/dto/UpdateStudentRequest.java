package com.mycollege.dto;

import com.mycollege.entity.Address;
import com.mycollege.general.Person;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@EqualsAndHashCode(callSuper = false)
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UpdateStudentRequest{
    
    private Integer id;
    private String firstName;
    private String middleName;
    private String lastName;
    private int age;
    private int addressId;
    private String address1;
    private String address2;
    private String city;
    private String state;
    private String country;
    private String pinCode;
    private String landMark;
    private String course;
    private String status;
    private String batch;

}
