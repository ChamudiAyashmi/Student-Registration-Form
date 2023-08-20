package edu.icet.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Student {
    private String firstName;
    private String lastName;
    private int age;
    private String phoneNumber;
    private String emailAddress;
    private String address;
    private String institute;
    private String batch;
    private String guardiansName;
}
