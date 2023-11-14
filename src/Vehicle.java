public class Vehicle {

    private String Make;
    private String Plate;
    private String Color;

    private VehicleType Category;

    public Vehicle(String make, String plate, String color, VehicleType category) {
        this.Make = make;
        this.Plate = plate;
        this.Color = color;
        this.Category = category;
    }
}
