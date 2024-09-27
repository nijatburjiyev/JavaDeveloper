package org.javadeveloper.lombok;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LombokTest {

    private static final Logger log = LoggerFactory.getLogger(LombokTest.class);

    public static void main(String[] args) {
        Student student = Student.builder()
                .name("John")
                .lastName("Doe")
                .age(25)
                // ... other properties
                .build();

        System.out.println(student);

       // log.info("Creating a new student: {}", student);
        log.error("Student lastName: " + student.getLastName());

    }
}
