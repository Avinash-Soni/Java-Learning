package Interface;

public class Eagle extends Bird{

    @Override
    public void fly() {
        System.out.println("Eagle is capable to fly.");
    }

    public static void main(String[] args) {
        Eagle obj = new Eagle();
        obj.fly();
        obj.sound();
    }
}
