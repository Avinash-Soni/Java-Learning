package ThreadJoin;

public class Thread3 extends Thread {
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("I am Thread 3");
        }
    }
}
