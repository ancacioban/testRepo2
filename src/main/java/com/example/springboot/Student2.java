package com.example.springboot;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
//@EqualsAndHashCode
public class Student2 extends Student {

    private String gender;

    public Student2(String name, int age, String gender) {
        this.gender = gender;
        this.setAge(age);
        this.setName(name);
    }
}
