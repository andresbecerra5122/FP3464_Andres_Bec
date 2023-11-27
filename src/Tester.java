public class Tester extends Employee
{
    private int noBugs;

     private final double GAIN_FACTOR_ERROR = 10;

    // Tester: name, birthYear, nbBugs, rate

    public Tester(String name, int birthYear, int noBugs) {
        super(name, birthYear);
        System.out.println("We have a new employee  :" + this.getName()+ " , a Tester.");
        if(IsValidateInputs(noBugs)){
            this.noBugs = noBugs;
        }else {
            throw new IllegalArgumentException("invalid input for number of projects");
        }
    }

    public Tester(String name, int birthYear, int noBugs, int occupationRate) {
        super(name, birthYear, occupationRate);
        System.out.println("We have a new employee  :" + this.getName()+ " , a Tester.");
        if(IsValidateInputs(noBugs)){
            this.noBugs = noBugs;
        }else {
            throw new IllegalArgumentException("invalid input for number of projects");
        }
    }
    public Tester(String name, int birthYear, int noBugs, Vehicle vehicle) {
        super(name, birthYear, vehicle);
        System.out.println("We have a new employee  :" + this.getName()+ " , a Tester.");
        if(IsValidateInputs(noBugs)){
            this.noBugs = noBugs;
        }else {
            throw new IllegalArgumentException("invalid input for number of projects");
        }
    }

    public Tester(String name, int birthYear, int noBugs, int occupationRate, Vehicle vehicle) {
        super(name, birthYear, occupationRate, vehicle);
        System.out.println("We have a new employee  :" + this.getName()+ " , a Tester.");
        if(IsValidateInputs(noBugs)){
            this.noBugs = noBugs;
        }else {
            throw new IllegalArgumentException("invalid input for number of projects");
        }
    }

    private boolean IsValidateInputs(int noBugs) {
        return noBugs >= 0;
    }

    public double getGAIN_FACTOR_ERROR() {
        return GAIN_FACTOR_ERROR;
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
        return this.getName() + " has an Occupation rate:" + this.getOccupationRate()
                + "% and corrected " + this.getNoBugs() + " Bugs. \n "
                + "His/Her estimated annual income is " + this.annualincome();
    }
}
