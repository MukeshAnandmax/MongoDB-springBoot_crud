package com.practice.mongodbspring;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(value = "my_user")
public class User {

    @Id
    private  int id;
    private  String name;
    private  List<String> contacts;
    private  int age;


}
