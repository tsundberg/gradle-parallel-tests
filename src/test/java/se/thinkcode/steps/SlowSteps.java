package se.thinkcode.steps;

import cucumber.api.java.en.Given;
import se.thinkcode.Slow;

public class SlowSteps {
    @Given("a wanted execution time of {int} seconds")
    public void a_wanted_execution_time_of_seconds(Integer wantedExecutionTime) {
        Slow slow = new Slow();

        long start = System.currentTimeMillis();
        System.out.println("Starting " + wantedExecutionTime);
        slow.noRush(wantedExecutionTime);

        long executionTime = System.currentTimeMillis() - start;
        System.out.println("Done " + wantedExecutionTime + ". It took " + executionTime + "ms");
    }
}
