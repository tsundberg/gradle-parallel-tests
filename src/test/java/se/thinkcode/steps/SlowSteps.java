package se.thinkcode.steps;

import cucumber.api.java.en.Given;
import se.thinkcode.Slow;

public class SlowSteps {
    @Given("a wanted execution time of {int} seconds")
    public void a_wanted_execution_time_of_seconds(Integer wantedExecutionTime) {
        String foo = System.getProperty("foo");
        if (foo != null) {
            System.out.println("Got the system property 'foo'");
        } else {
            System.out.println("Did not get the system property 'foo'");
        }

        Slow slow = new Slow();

        long start = System.currentTimeMillis();
        System.out.println("Starting " + wantedExecutionTime);
        slow.noRush(wantedExecutionTime);

        long executionTime = System.currentTimeMillis() - start;
        System.out.println("Done " + wantedExecutionTime + ". It took " + executionTime + "ms");
    }
}
