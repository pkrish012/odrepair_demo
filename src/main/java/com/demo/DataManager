package com.demo;

public class DataManager {
    // Shared state that causes flakiness
    public static String currentUser = null;

    public static void login(String user) {
        currentUser = user;
    }

    public static void logout() {
        currentUser = null;
    }

    public static String getStatus() {
        return (currentUser == null) ? "GUEST" : "LOGGED_IN";
    }
}
