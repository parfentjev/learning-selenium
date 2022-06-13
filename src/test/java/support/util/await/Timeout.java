package support.util.await;

public enum Timeout {
    FAST(5),
    REGULAR(10),
    SLOW(30);

    private int seconds;

    Timeout(int seconds) {
        this.seconds = seconds;
    }

    public int getSeconds() {
        return seconds;
    }
}
