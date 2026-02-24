package com.demo;

import org.junit.Test;
import static org.junit.Assert.*;

public class DataManagerTest {

    @Test
    public void testGuestStatus() {
        DataManager.resetAll();
        assertEquals("GUEST", DataManager.getStatus());
    }

    @Test
    public void testLoginStatus() {
        DataManager.resetAll();
        DataManager.login("Alice");
        assertEquals("LOGGED_IN", DataManager.getStatus());
        assertNotNull(DataManager.getSession("Alice"));
    }

    @Test
    public void polluteState() {
        // Pollute multiple state variables without resetting
        DataManager.login("EvilPolluter");
        DataManager.incrementCounter();
        DataManager.sessionData.put("X", "Y");
    }
}
