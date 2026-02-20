package com.demo;

public class OrderBugTest {

    private final String[] messages = { "BAD_1", "OK_2", "BAD_3" };

    // Swap two messages (simulates different orders)
    public void shuffle(int i, int j) {
        String temp = messages[i];
        messages[i] = messages[j];
        messages[j] = temp;
    }

    public String getMessage(int index) {
        return messages[index];
    }

    public int size() {
        return messages.length;
    }

    public void reset() {
        // Restore original order
        messages[0] = "BAD_1";
        messages[1] = "OK_2";
        messages[2] = "BAD_3";
    }
}
