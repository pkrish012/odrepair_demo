package com.demo;

import org.junit.Test;
import static org.junit.Assert.*;

public class DataManagerTest {

    @Test
    public void testGuestStatus() {
        // This fails if another test called login() and didn't logout()
        assertEquals("GUEST", DataManager.getStatus());
    }

    @Test
    public void testLoginStatus() {
        DataManager.login("Alice");
        assertEquals("LOGGED_IN", DataManager.getStatus());
        // ODRepair will notice that Alice is still logged in after this!
    }
    
    @Test
    public void polluteState() {
        // Sets the static field but never resets it
        DataManager.login("EvilPolluter");
    }
}
