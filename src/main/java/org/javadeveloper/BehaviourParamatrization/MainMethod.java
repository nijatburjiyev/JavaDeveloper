package org.javadeveloper.BehaviourParamatrization;

import java.util.ArrayList;
import java.util.List;

public class MainMethod {

    public static void main(String[] args) {
        List<Apple> inventory = new ArrayList<>();
        inventory.add(new Apple(200, "Green"));
        inventory.add(new Apple(150, "Green"));
        inventory.add(new Apple(130, "Green"));
        inventory.add(new Apple(50, "Green"));
        inventory.add(new Apple(200, "Red"));
        inventory.add(new Apple(250, "Red"));

        System.out.println(inventory);
        System.out.println("\n-----------------------\n");


        List<Apple> greenApples = findInventory(inventory, new AppleGreenBehaviour());

        System.out.println(greenApples);


    }

    private static List<Apple> findInventory(List<Apple> inventory, AppleTest appleTest) {
        List<Apple> filtered = new ArrayList<>();
        for (Apple apple: inventory){
            if (appleTest.testTheApple(apple)) {  //we call the green apple behaviour and we pass apple inside of it for test
                filtered.add(apple);
            }
        }

        return filtered;
    }


}
