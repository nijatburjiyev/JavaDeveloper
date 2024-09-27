package org.javadeveloper.functionalInterfaces;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class CarTest {
    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>();
        cars.add(Car.builder().color("Red").speed(200).build());
        cars.add(Car.builder().color("Yellow").speed(150).build());
        cars.add(Car.builder().color("Blue").speed(120).build());
        cars.add(Car.builder().color("White").speed(100).build());
        cars.add(Car.builder().color("Gray").speed(80).build());


        testCar(cars, p -> p.getSpeed() >= 120);
        System.out.println("--------------------");
        testCar(cars, p -> p.getColor().equals("Red"));
    } //main

    public static void testCar(List<Car> cars, Predicate<Car> p){
        for (Car car: cars){
            if(p.test(car)){
                System.out.println(car);
            }
        }
    }
} //class
