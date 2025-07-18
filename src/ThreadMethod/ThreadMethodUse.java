package ThreadMethod;

public class ThreadMethodUse extends Thread {

    public void run(){

        for (int i = 0; i < 10; i++) {
            try {
                System.out.println("Hello Thread");
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("Thread Terminated.");


    }


}
