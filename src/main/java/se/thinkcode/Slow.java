package se.thinkcode;

public class Slow {

    public void noRush(int seconds) {
        long sleep = 1000 * seconds;
        try {
            Thread.sleep(sleep);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
