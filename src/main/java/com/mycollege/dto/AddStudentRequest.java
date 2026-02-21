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
public class AddStudentRequest extends Person {

    public String firstName;
    public String middleName;
    public String lastName;
    public int age;
    private String address1;
    private String address2;
    private String city;
    private String state;
    private String country;
    private String pinCode;
    private String landMark;
    private int courseId;
    private int enrollmentYear;
    private String batch;

}
