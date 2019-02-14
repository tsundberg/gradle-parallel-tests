package se.thinkcode.steps;

import cucumber.api.java.en.Given;

public class SlowSteps {
    @Given("a wanted execution time of {int} seconds")
    public void a_wanted_execution_time_of_seconds(Integer wantedExecutionTime) throws Exception {
        long start = System.currentTimeMillis();
        System.out.println("Starting " + wantedExecutionTime);
        int sleepTime = wantedExecutionTime * 1000;
        Thread.sleep(sleepTime);

        long executionTime = System.currentTimeMillis() - start;
        System.out.println("Done " + wantedExecutionTime + ". It took " + executionTime + "ms");
    }
}
