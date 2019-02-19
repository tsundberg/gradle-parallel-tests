package se.thinkcode;

import java.net.URL;

public class ResourceLocator {
    public URL findSample() {
        return getClass().getResource("/sample.txt");
    }
}
