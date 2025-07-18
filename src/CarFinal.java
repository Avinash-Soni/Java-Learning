public class CarFinal {
    final int noOfWheels;
    final String model;
    final String engineInLiters;

    //This value is assign only one time when we try to call again it will show error.
    public CarFinal(int noOfWheels, String model, String engineInLiters) {
        this.noOfWheels = noOfWheels;
        this.model = model;
        this.engineInLiters = engineInLiters;
    }
}
