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
@Document(collection = "address")
public class Address {

    @Id
    private String id;

    private String address1;
    private String address2;
    private String city;
    private String state;
    private String country;
    private String pinCode;
    private String landMark;
}
