import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class TestThread implements Runnable {
    public static int count;
    static Lock lock = new ReentrantLock();

    @Override
    public void run() {
        for (int i = 0; i < 1_000_000; i++) {
//            lock.lock();
            count++;
//            lock.unlock();
//            try {
//                Thread.sleep(5);
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
        }
    }
}
