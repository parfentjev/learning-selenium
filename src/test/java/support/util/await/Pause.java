package support.util.await;

public class Pause {
    public void sleep(long milliseconds) {
        try {
            Thread.sleep(milliseconds);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public void sleep(Timeout timeout) {
        sleep(timeout.getSeconds() * 1000L);
    }
}
