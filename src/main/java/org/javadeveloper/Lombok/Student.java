package org.javadeveloper.Lombok;

import lombok.*;
import lombok.extern.slf4j.Slf4j;

import java.util.Objects;
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode
@Slf4j
public class Student {
    private String name;
    private String lastName;
    private String course;
    private String major;
    private String userName;
    private String password;
    private int age;
    private int score;

}
