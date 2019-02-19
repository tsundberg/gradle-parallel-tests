package se.thinkcode.steps;

import org.junit.Test;
import se.thinkcode.ResourceLocator;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.fail;

public class ClasspathTest {

    @Test
    public void should_find_resource_on_classpath() {
        ResourceLocator resourceLocator = new ResourceLocator();

        assertThat(resourceLocator.findSample()).isNotNull();
    }
}
