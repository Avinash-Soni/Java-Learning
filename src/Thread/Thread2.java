package Thread;

public class Thread2 extends Thread {
    @Override
    public void run(){
        for (int i = 0; i < 10; i++) {
            System.out.println("Hello from Thread 2.");
        }
    }
}
