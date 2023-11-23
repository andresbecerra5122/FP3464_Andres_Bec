import java.time.Year;

public abstract class Employee {
//test
    private String Name;
    private int BirthYear;

    private double MontlyIncome;
    private int age;
    private int OccupationRate;

    private Vehicle vehicle;

    private Contract contract;

    public  abstract double annualincome();


    public Employee(String name, int birthYear) {
        this.Name = name;
        this.BirthYear = birthYear;
        this.OccupationRate = 100;
        this.MontlyIncome = 100;
        this.age = 2023 - birthYear;

    }

    public Employee(String name, int birthYear, int occupationRate, Vehicle vehicle) {
        this(name, birthYear);
        if(OccupationRate < 10){
            this.OccupationRate = 10;
        } else this.OccupationRate = Math.min(OccupationRate, 100);
    }

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

    public int getOccupationRate() {
        return OccupationRate;
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

    public void setContract(Contract contract) {
        this.contract = contract;
    }
}
