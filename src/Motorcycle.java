public class Motorcycle extends  Vehicle{

    private Boolean SideCar;

    public Motorcycle(String make, String plate, String color, VehicleType category, Boolean sideCar) {
        super(make, plate, color, category);
        SideCar = sideCar;
    }

    public Boolean getSideCar() {
        return SideCar;
    }

    public void setSideCar(Boolean sideCar) {
        SideCar = sideCar;
    }

    // Method to generate a string representation of the bike
    public String toString(){
        String Total = super.toString();
        Total = Total + "   -SideCar: "+ this.getSideCar() + "\n";
        return  Total;
    }
}
