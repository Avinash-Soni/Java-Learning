package TrafficSignal;

public class Road {
    public static void main(String[] args) throws InterruptedException {
        TrafficLight red = new TrafficLight(TrafficColor.Red);
        TrafficLight yellow = new TrafficLight(TrafficColor.Yellow);
        TrafficLight green = new TrafficLight(TrafficColor.Green);

        red.start();
        red.join();
        yellow.start();
        yellow.join();
        green.start();
    }
}
