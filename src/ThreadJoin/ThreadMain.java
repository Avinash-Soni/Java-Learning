package ThreadJoin;

public class ThreadMain {
    public static void main(String[] args) throws InterruptedException {
        Thread1 t1 = new Thread1();
        Thread2 t2 = new Thread2();
        Thread3 t3 = new Thread3();

        t1.start();
        System.out.println("Thread 1 is started.");
        System.out.println(t1.getName());
        t1.join();
        System.out.println("Thread 1 is end.");
        t2.start();
        System.out.println("Thread 2 is started.");
        System.out.println(t2.getName());
        t2.join();
        System.out.println("Thread 2 is end.");
        t3.start();
        System.out.println("Thread 3 is started.");
        System.out.println(t3.getName());
        t3.join();
        System.out.println("Thread 3 is end.");
    }
}
