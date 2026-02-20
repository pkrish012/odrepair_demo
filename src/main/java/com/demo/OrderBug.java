package com.demo;

public class OrderBug {
    private boolean stepOneDone = false;

    public void stepOne() {
        stepOneDone = true;
    }

    public void stepTwo() {
        if (!stepOneDone) {
            throw new IllegalStateException("stepOne must be called before stepTwo!");
        }
    }
}
