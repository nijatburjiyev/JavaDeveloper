package org.javadeveloper.behaviourParametrezation;

public class AppleWeightBehaviour implements AppleTest{
    @Override
    public boolean testTheApple(Apple apple) {
        return apple.getWeight()>150;
    }
}
