public abstract class Employee {

    private String Name;
    private int BirthYear;

    private double MontlyIncome;

    private int OcupationRate;

    private Vehicle vehicle;

    public  abstract double annualincome();


    public Employee(String name, int birthYear, double annualIncome, int ocupationRate) {
        this.Name = name;
        this.BirthYear = birthYear;
        this.MontlyIncome = annualIncome;
        this.OcupationRate = ocupationRate;
    }

    public Employee(String name, int birthYear, double annualIncome, int ocupationRate, Vehicle vehicle) {
        this.Name = name;
        this.BirthYear = birthYear;
        this.MontlyIncome = annualIncome;
        this.OcupationRate = ocupationRate;
        this.vehicle = vehicle;
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

    public int getOcupationRate() {
        return OcupationRate;
    }

    public void setOcupationRate(int ocupationRate) {
        OcupationRate = ocupationRate;
    }
}
