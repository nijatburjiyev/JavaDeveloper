package org.javadeveloper.BehaviourParamatrization;

public class AppleGreenBehaviour implements AppleTest {

    @Override
    public boolean testTheApple(Apple apple) {
        return apple.getColor().equals("Green");
    }
}
