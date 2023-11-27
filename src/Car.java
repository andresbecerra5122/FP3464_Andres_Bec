public class Car extends Vehicle {

    // Fields representing the characteristics of a Car
    private Gear gear;
    private CarType type;

    // Constructor to initialize the Car object with specific attributes
    public Car(String make, String plate, String color, VehicleType category, Gear gear, CarType type) {
        // Call the constructor of the superclass (Vehicle) to set common attributes
        super(make, plate, color, category);
        // Set specific attributes of the Car
        this.gear = gear;
        this.type = type;
    }

    // Getter and setter methods
    public Gear getGear() {
        return gear;
    }

    public void setGear(Gear gear) {
        this.gear = gear;
    }


    public CarType getType() {
        return type;
    }

    public void setType(CarType type) {
        this.type = type;
    }

    // Override the toString method to provide a custom string representation of the Car
    @Override
    public String toString() {
        // Call the toString method of the superclass (Vehicle) to include common attributes
        String total = super.toString();
        // Add Car-specific information to the string representation
        total = total + "   -Gear: " + this.getGear() + "\n";
        total = total + "   -Type: " + this.getType() + "\n";
        return total;
    }
}
