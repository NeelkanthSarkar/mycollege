package com.mycollege.general;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Person {

     int id;
     String firstName;
     String middleName;
     String lastName;
     int age;
     int addressId;
     int roleId;
     String mobileNo;
     String email;
     String dateOfBirth;
     String createdDate;
}
