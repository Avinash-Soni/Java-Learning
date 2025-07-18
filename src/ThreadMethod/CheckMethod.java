package ThreadMethod;

public class CheckMethod {
    public static void main(String[] args) throws InterruptedException {
        ThreadMethodUse t = new ThreadMethodUse();
        long startTime = System.currentTimeMillis();
        System.out.println(t.getState());
        System.out.println("Thread created.");
        t.start();
        System.out.println("Thread Started");
        System.out.println(t.getState());
        t.join();
        System.out.println(t.getState());
        long endTime = System.currentTimeMillis();
        System.out.println("Time taken by thread = "+(endTime-startTime));
    }
}
