package se.thinkcode;

import org.junit.Ignore;
import org.junit.Test;

public class OneTest {
    @Test
    @Ignore
    public void should_sleep_4_seconds() throws Exception {
        System.out.println("Start 4 seconds");
        Thread.sleep(4000);
        System.out.println("Done 4 seconds");
    }
}
