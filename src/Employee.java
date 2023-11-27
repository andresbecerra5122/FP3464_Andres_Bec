import java.time.Year;

public abstract class Employee {
//test
    private final String Name;
    private int BirthYear;

    private double MontlyIncome;
    private int age;
    private int OccupationRate;

    private Vehicle vehicle;

    private Contract contract;

    public  abstract double annualincome();

    // Constructor for initializing basic information of an Employee
    public Employee(String name, int birthYear) {
        this.Name = name;
        this.BirthYear = birthYear;
        this.OccupationRate = 100;
        this.MontlyIncome = 1200;
        this.age = 2023 - birthYear;
    }

    // Constructor with occupation rate, ensuring a minimum value
    public Employee(String name, int birthYear, int occupationRate) {
        this(name, birthYear);
        if(occupationRate < 10){
            this.OccupationRate = 10;
        } else this.OccupationRate = Math.min(occupationRate, 100);
    }

    // Constructor with a vehicle
    public Employee(String name, int birthYear, Vehicle vehicle){
        this(name, birthYear);
        this.vehicle = vehicle;
    }

    // Constructor with occupation rate and a vehicle
    public Employee(String name, int birthYear, int occupationRate, Vehicle vehicle){
        this(name, birthYear, occupationRate);
        this.vehicle = vehicle;
    }

    //getter and setter methods
    public String getName() {
        return Name;
    }

    public int getBirthYear() {
        return BirthYear;
    }

    public double getMontlyIncome() {
        return MontlyIncome;
    }

    public void setMontlyIncome(double montlyIncome) {
        MontlyIncome = montlyIncome;
    }

    public void setBirthYear(int birthYear) {
        BirthYear = birthYear;
        this.age = 2023 - birthYear;
    }


    public int getOccupationRate() {
        return OccupationRate;
    }

    public void setAge(int age) {
        this.age = age;
        this.BirthYear = 2023 - age;
    }

    public void setOccupationRate(int occupationRate) {
        OccupationRate = occupationRate;
    }

    public int getAge(){
        return Year.now().getValue() - getBirthYear();
    }
    public void signContract(Contract p1){
        this.setContract(p1);
    }

    //abstract method for contranctInfo
    public abstract String contractInfo();

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public Contract getContract() {
        return contract;
    }

    //setter method for setContract to change the contract from permanent to temporary and vice versa
    public void setContract(Contract contract) {
        this.contract = contract;
    }
}
