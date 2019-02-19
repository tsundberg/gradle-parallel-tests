package se.thinkcode.steps;

import cucumber.api.java.en.Given;
import se.thinkcode.ResourceLocator;
import se.thinkcode.Slow;

import java.net.URL;

import static org.assertj.core.api.Assertions.assertThat;

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

    @Given("a resource should be possible to find")
    public void a_resource_should_be_possible_to_find() {
        ResourceLocator resourceLocator = new ResourceLocator();

        URL sample = resourceLocator.findSample();
        assertThat(sample).isNotNull();

        System.out.println(sample.getFile());
    }
}
