package com.demo;

public class OrderBug {

    private boolean stepOneDone = false;

    public void stepOne() {
        stepOneDone = true;
        System.out.println("Step one completed.");
    }

    public void stepTwo() {
        if (!stepOneDone) {
            throw new IllegalStateException("stepTwo called before stepOne!");
        }
        System.out.println("Step two completed.");
    }

    public void reset() { // optional for ODRepair's reseter
        stepOneDone = false;
    }
}
