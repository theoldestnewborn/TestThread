public class Main {
    public static void main(String[] args) {
//        runDataRace(new TestThread(), new TestThread(), () -> TestThread.count);
//        runDataRace(new TestLockThread(), new TestLockThread(), () -> TestLockThread.count);
//        runDataRace(new TestAtomicThread(), new TestAtomicThread(), () -> TestAtomicThread.count.get());
        runDataRace(new TestSynchronizedThread(), new TestSynchronizedThread(), () -> TestSynchronizedThread.count);
    }

    public static void runDataRace(Runnable first, Runnable second, GetThreadResult getResult) {

        Thread new1 = new Thread(first);
        Thread new2 = new Thread(second);

        new1.start();
        new2.start();

        try {
            new1.join();
            new2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Result is - " + getResult.get());
    }

}

@FunctionalInterface
interface GetThreadResult {
    int get();
}


