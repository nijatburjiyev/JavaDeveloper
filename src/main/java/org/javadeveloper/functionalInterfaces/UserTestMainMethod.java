package org.javadeveloper.functionalInterfaces;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class UserTestMainMethod {
    public static void main(String[] args) {
        List<User> users = new ArrayList<>();
        users.add(new User("Nick", "Loman"));
        users.add(new User("John", "Doe"));
        users.add(new User("Nick", "Elan"));
        users.add(new User("Nick", "Emmy"));

        System.out.println(users);

        Predicate<User> print = (User user) -> user.getLastName().startsWith("E");

        for (User user : users){
            if(print.test(user)){
                System.out.println(user);
            }
        }

        Runnable run  = new Runnable() {
            @Override
            public void run() {
                System.out.println("Task is running...");
            }
        };

        Runnable run2 = () -> System.out.println("Task 2 is running...");



    }  //main

    public void taskRunner(List<User> users, Runnable run2){
        for (User user:users){
            run2.run();
        }
    }
} //class
