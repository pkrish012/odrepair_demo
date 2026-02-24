package com.demo;

import java.util.HashMap;
import java.util.Map;

public class DataManager {
    // Shared state
    public static String currentUser = null;
    public static Map<String, String> sessionData = new HashMap<>();
    public static int counter = 0;

    // Simple login/logout
    public static void login(String user) {
        currentUser = user;
        counter++;
        sessionData.put(user, "SESSION_" + counter);
    }

    public static void logout() {
        if (currentUser != null) {
            sessionData.remove(currentUser);
        }
        currentUser = null;
    }

    // Additional methods to manipulate state
    public static void resetAll() {
        currentUser = null;
        sessionData.clear();
        counter = 0;
    }

    public static void incrementCounter() {
        counter++;
    }

    public static String getStatus() {
        return (currentUser == null) ? "GUEST" : "LOGGED_IN";
    }

    public static String getSession(String user) {
        return sessionData.getOrDefault(user, null);
    }
}
