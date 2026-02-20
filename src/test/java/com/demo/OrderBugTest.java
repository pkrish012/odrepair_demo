import org.junit.Test;
import java.util.Random;

import static org.junit.Assert.*;

public class OrderBugTest {

    static class Listener {
        String received;

        void onMessage(String msg) {
            // Only accept messages starting with "OK"
            if (msg.startsWith("OK")) {
                received = msg;
            }
        }
    }

    @Test
    public void testOrderDependentFlakiness() {
        Listener listener = new Listener();

        String[] messages = { "BAD_1", "OK_2", "BAD_3" };

        // Randomize order to simulate flaky behavior
        for (int i = 0; i < messages.length; i++) {
            int j = new Random().nextInt(messages.length);
            String temp = messages[i];
            messages[i] = messages[j];
            messages[j] = temp;
        }

        for (String msg : messages) {
            listener.onMessage(msg);
        }

        // Expect the listener to have received the OK message
        // Sometimes this fails if the first message was "BAD" and triggers a bad state
        assertEquals("OK_2", listener.received);
    }
}
