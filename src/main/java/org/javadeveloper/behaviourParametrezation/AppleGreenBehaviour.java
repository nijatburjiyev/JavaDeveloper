package org.javadeveloper.behaviourParametrezation;

public class AppleGreenBehaviour implements AppleTest {

    @Override
    public boolean testTheApple(Apple apple) {
        return apple.getColor().equals("Green");
    }
}
