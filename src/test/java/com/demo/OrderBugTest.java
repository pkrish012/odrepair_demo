package com.demo;

import org.junit.Test;

public class OrderBugTest {

    @Test
    public void testOrderDependency() {
        OrderBug bug = new OrderBug();
        bug.stepTwo(); // <- this should fail
    }
}
