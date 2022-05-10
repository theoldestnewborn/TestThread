public class TestSynchronizedThread implements Runnable{

    public static int count;

    private static synchronized void inc() {
        count++;
    }

    @Override
    public void run() {
        for (int i = 0; i<10_000_000; i++) {
            inc();
        }
    }
}
