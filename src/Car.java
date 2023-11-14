public class Car extends Vehicle{

    private Gear Gear;
    private CarType Type;

    public Car(String make, String plate, String color, VehicleType category, Gear gear, CarType type) {
        super(make, plate, color, category);
        Gear = gear;
        Type = type;
    }
}

