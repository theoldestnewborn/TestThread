public class TestThread extends Thread{
    public int count;
    public String name;

    public TestThread (String name){
        this.name = name;
    }



    @Override
    public void run() {
        for (int i =0; i<10;i++) {
            try {
                Thread.sleep(5);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(name + " - " + count);
            count++;
        }
    }
}
