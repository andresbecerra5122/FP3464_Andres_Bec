import java.time.Year;

public abstract class Employee {

    private String Name;
    private int BirthYear;

    private double MontlyIncome;

    private int OcupationRate;

    private Vehicle vehicle;

    private Contract contract;

    public  abstract double annualincome();


    public Employee(String name, int birthYear, int ocupationRate) {
        this.Name = name;
        this.BirthYear = birthYear;
        this.OcupationRate = ocupationRate;
        this.MontlyIncome = 100;
        System.out.println("We have a new employee :" + this.getName()+ " , a " + this.getClass().getName());

    }

    public Employee(String name, int birthYear, int ocupationRate, Vehicle vehicle) {
        this.Name = name;
        this.BirthYear = birthYear;
        this.MontlyIncome = 1000;
        this.OcupationRate = ocupationRate;
        this.vehicle = vehicle;
        System.out.println("We have a new employee :" + this.getName()+ " , a " + this.getClass().getName());

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


    public int getOcupationRate() {
        return OcupationRate;
    }

    public void setOcupationRate(int ocupationRate) {
        OcupationRate = ocupationRate;
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

    public String toString(){
        String Total = "Name: " + this.getName()+ ", a "+ this.getClass().getName() + " \n" +
                "Age: " + this.getAge() + "\n";
        Vehicle vehicle = this.getVehicle();
        if(vehicle != null)
        {
            Total = Total + vehicle.toString();
        }

        return  Total;
    }

}
