package com.mycollege.general;

import com.mycollege.entity.Address;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Person {

     String id;
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
