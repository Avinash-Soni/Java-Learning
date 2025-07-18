package TrafficSignal;

public enum TrafficColor {
    Red(9000),
    Yellow(1000),
    Green(3000);

    private final int time;

    public int getTime() {
        return time;
    }

    TrafficColor(int time) {
        this.time = time;
    }
}
