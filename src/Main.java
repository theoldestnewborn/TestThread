public class Main {
    public static void main(String[] args) throws InterruptedException {

        TestThread new1 = new TestThread("first");
        TestThread new2 = new TestThread("second");
        TestThread new3 = new TestThread("third");
        
        new3.start();
        new3.join();

        new2.start();
        new2.join();

        new1.start();
        new1.join();

        System.out.println("finished");

    }
}