package TrafficSignal;

public class TrafficLight extends Thread {

    private final TrafficColor color;

    public TrafficLight(TrafficColor color){
        this.color = color;
    }

    public void run(){
        System.out.printf("%s active\n",color);
        try {
            Thread.sleep(color.getTime());
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.printf("%s inactive\n",color);
    }

}
