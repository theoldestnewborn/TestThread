import java.util.concurrent.atomic.AtomicInteger;

public class TestAtomicThread implements Runnable{

    static AtomicInteger count = new AtomicInteger(0);

    @Override
    public void run() {
        for (int i = 0; i<10_000_000; i++){
            count.incrementAndGet();
        }
    }
}
