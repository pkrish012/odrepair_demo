package com.demo;

import org.junit.Test;
import static org.junit.Assert.*;

public class DummyTest {

    @Test
    public void testPass() {
        assertTrue(true);
    }

    @Test
    public void testFail() {
        assertFalse(false);
    }
}