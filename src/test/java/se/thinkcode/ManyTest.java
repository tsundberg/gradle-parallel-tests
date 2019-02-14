package se.thinkcode;

import org.junit.Ignore;
import org.junit.Test;

public class ManyTest {

    @Test
    @Ignore
    public void should_sleep_1_seconds() throws Exception {
        System.out.println("Start 1 seconds");
        Thread.sleep(1000);
        System.out.println("Done 1 seconds");
    }

    @Test
    @Ignore
    public void should_sleep_2_seconds() throws Exception {
        System.out.println("Start 2 seconds");
        Thread.sleep(2000);
        System.out.println("Done 2 seconds");
    }

    @Test
    @Ignore
    public void should_sleep_3_seconds() throws Exception {
        System.out.println("Start 3 seconds");
        Thread.sleep(3000);
        System.out.println("Done 3 seconds");
    }

    @Test
    @Ignore
    public void should_sleep_4_seconds() throws Exception {
        System.out.println("Start 4 seconds");
        Thread.sleep(4000);
        System.out.println("Done 4 seconds");
    }
}
