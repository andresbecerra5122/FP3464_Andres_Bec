public class Tester extends Employee
{
    private int noBugs;

     private double GAIN_FACTOR_ERROR = 10;

    // Tester: name, birthYear, nbBugs, rate

    public Tester(String name, int birthYear, int noBugs, int occupationRate) {
        super(name, birthYear, occupationRate);
        System.out.println("We have a new employee  :" + this.getName()+ " , a Tester.");
        this.noBugs = noBugs;
    }

    public Tester(String name, int birthYear, int noBugs, int occupationRate, Vehicle vehicle) {
        super(name, birthYear, occupationRate, vehicle);
        System.out.println("We have a new employee  :" + this.getName()+ " , a Tester.");
        this.noBugs = noBugs;
    }
    public int getNoBugs() {
        return noBugs;
    }

    public void setNoBugs(int noBugs) {
        this.noBugs = noBugs;
    }

    @Override
    public double annualincome() {
        double base = getMontlyIncome() * 12;
        double extra = GAIN_FACTOR_ERROR *  getNoBugs();
        return extra + base ;

    }

    @Override
    public void signContract(Contract p1) {
          this.setContract(p1);
    }

    @Override
    public String contractInfo() {
        return this.getName() + " is a Tester " + getContract().GetContractinfo();
    }

    public String toString(){

        String Total = "Name: " + this.getName()+ ", a Tester \n" +
                "Age: " + this.getAge() + "\n";

        Vehicle vehicle = this.getVehicle();
        if(vehicle != null)
        {
            Total = Total + vehicle.toString();
        }
        Total = Total + GetTesterInfo();
        return Total;
    }

    private String GetTesterInfo() {
        return this.getName() + " has an Occupation rate:" + this.getOcupationRate()
                + "% and corrected " + this.getNoBugs() + " Bugs. \n "
                + "His/Her estimated annual income is " + this.annualincome();
    }
}
