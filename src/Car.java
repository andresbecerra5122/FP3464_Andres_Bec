public class Car extends Vehicle{

    private Gear Gear;
    private CarType Type;

    public Car(String make, String plate, String color, VehicleType category, Gear gear, CarType type) {
        super(make, plate, color, category);
        Gear = gear;
        Type = type;
    }


    public Gear getGear() {
        return Gear;
    }

    public void setGear(Gear gear) {
        Gear = gear;
    }

    public CarType getType() {
        return Type;
    }

    public void setType(CarType type) {
        Type = type;
    }

    public String toString(){
        String Total = super.toString();
        Total = Total + "   -Gear: "+ this.getGear() + "\n";
        Total = Total + "   -Type: "+ this.getType() + "\n";
        return  Total;
    }
}

