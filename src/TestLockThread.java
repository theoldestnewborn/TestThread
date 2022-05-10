import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class TestLockThread implements Runnable {
    public static int count;
    static Lock lock = new ReentrantLock();

    @Override
    public void run() {
        for (int i = 0; i < 15; i++) {
            lock.lock();
            System.out.println(Thread.currentThread().getName() + " is " + Thread.currentThread().getState());
            count++;
            lock.unlock();
            try {
                Thread.sleep(5);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
