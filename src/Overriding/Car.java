package Overriding;

public class Car extends Vehicle{

    @Override
    void service() {
        super.service();
        System.out.println("I am in service method which is define in car class.");
    }

    public static void main(String[] args) {
        Car obj = new Car();
        obj.service();
    }
}
