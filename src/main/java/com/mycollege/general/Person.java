package com.mycollege.general;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Person {

     @Id
     private String id;
     private String firstName;
     private String middleName;
     private String lastName;
     private int age;
     private String designation;
     private String mobileNo;
     private String email;
     private String dateOfBirth;
     private String createdDate;
     private String addressId;
}
