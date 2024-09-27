package org.javadeveloper.functionalInterfaces;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Car {
    private String color;
    private int speed;
}
