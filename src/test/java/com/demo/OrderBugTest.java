package com.demo;

import org.junit.Test;

public class OrderBugTest {

    @Test(expected = IllegalStateException.class)
    public void testOrderDependency() {
        OrderBug bug = new OrderBug();
        bug.stepTwo(); // <- should fail
    }

    @Test
    public void testCorrectOrder() {
        OrderBug bug = new OrderBug();
        bug.stepOne();
        bug.stepTwo(); // <- should succeed
    }
}
