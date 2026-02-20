package com.demo;

import org.junit.Test;
import static org.junit.Assert.*;

public class DummyTest {

    // Shared state to introduce order-dependency
    private static boolean sharedFlag = false;

    @Test
    public void testSetFlag() {
        sharedFlag = true;  // Sets shared state
        assertTrue(sharedFlag);
    }

    @Test
    public void testDependsOnFlag() {
        // Fails if run after testSetFlag
        assertFalse(sharedFlag);
    }
}
