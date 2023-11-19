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

    public String toString(){

        String Total = "   - Make: " + this.getMake() + "\n";
        Total = Total +"   - Plate: "+ this.getPlate() + "\n";
        Total = Total +"   - Color: "+ this.getColor() + "\n";
        Total = Total +"   - Category: "+ this.getCategory() + "\n";
        return Total;
    }

    public String getMake() {
        return Make;
    }

    public void setMake(String make) {
        Make = make;
    }

    public String getPlate() {
        return Plate;
    }

    public void setPlate(String plate) {
        Plate = plate;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String color) {
        Color = color;
    }

    public VehicleType getCategory() {
        return Category;
    }

    public void setCategory(VehicleType category) {
        Category = category;
    }
}
