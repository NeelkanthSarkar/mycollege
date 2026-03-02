package com.mycollege.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "sharedvalues")
public class SharedValues {

    @Id
    private String id;
    private String value;
    private String group;

    public SharedValues(String value,String group){
        this.value = value;
        this.group = group;
    }
}
